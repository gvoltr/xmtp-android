package org.xmtp.android.library.messages

import com.google.protobuf.kotlin.toByteString
import java.security.SecureRandom
import kotlinx.coroutines.runBlocking
import org.xmtp.android.library.Crypto
import org.xmtp.android.library.SigningKey
import org.xmtp.android.library.XMTPException
import org.xmtp.proto.message.contents.PrivateKeyOuterClass

typealias PrivateKeyBundle = PrivateKeyOuterClass.PrivateKeyBundle

class PrivateKeyBundleBuilder {
    companion object {
        fun buildFromV1Key(v1: PrivateKeyBundleV1): PrivateKeyBundle {
            return PrivateKeyBundle.newBuilder().also {
                it.v1 = v1
            }.build()
        }
    }
}

fun PrivateKeyBundle.encrypted(key: SigningKey): EncryptedPrivateKeyBundle {
    val bundleBytes = toByteArray()
    val walletPreKey = SecureRandom().generateSeed(32)
    val signature =
        runBlocking {
            key.sign(
                message = Signature.newBuilder().build().enableIdentityText(key = walletPreKey)
            )
        } ?: throw XMTPException("Illegal signature")
    val cipherText = Crypto.encrypt(signature.rawDataWithNormalizedRecovery, bundleBytes)
    return EncryptedPrivateKeyBundle.newBuilder().apply {
        v1Builder.walletPreKey = walletPreKey.toByteString()
        v1Builder.ciphertext = cipherText
    }.build()
}
