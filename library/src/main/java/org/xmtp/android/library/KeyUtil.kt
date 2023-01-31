package org.xmtp.android.library

import org.bouncycastle.asn1.sec.SECNamedCurves
import org.bouncycastle.crypto.params.ECDomainParameters
import org.bouncycastle.math.ec.FixedPointCombMultiplier
import org.bouncycastle.util.Arrays
import org.web3j.crypto.Sign.SignatureData
import java.math.BigInteger

object KeyUtil {
    fun getPublicKey(privateKey: ByteArray): ByteArray {
        val params = SECNamedCurves.getByName("secp256k1")
        val curve = ECDomainParameters(params.curve, params.g, params.n, params.h)

        var privKey = BigInteger(1, privateKey)

        if (privKey.bitLength() > curve.n.bitLength()) {
            privKey = privKey.mod(curve.n)
        }

        val point = FixedPointCombMultiplier().multiply(curve.getG(), privKey)
        return Arrays.copyOfRange(point.getEncoded(false), 1, 65)
    }

    fun addUncompressedByte(publicKey: ByteArray): ByteArray {
        return if (publicKey.size >= 65) {
            val newPublicKey = ByteArray(64)
            System.arraycopy(publicKey, publicKey.size - 64, newPublicKey, 0, 64)
            byteArrayOf(0x4.toByte()) + newPublicKey
        } else {
            byteArrayOf(0x4.toByte()) + publicKey
        }
    }

    fun getSignatureData(signatureBytes: ByteArray): SignatureData {
        val v = signatureBytes[64]
        if (v < 27) {
            (v.plus(27))
        }
        val r = signatureBytes.copyOfRange(0, 32)
        val s = signatureBytes.copyOfRange(32, 64)
        return SignatureData(v, r, s)
    }

    fun getSignatureBytes(sig: SignatureData): ByteArray {
        val v = sig.v[0]
        val fixedV = if (v >= 27) (v - 27).toByte() else v
        return merge(
            sig.r,
            sig.s,
            byteArrayOf(fixedV),
        )
    }

    private fun merge(vararg arrays: ByteArray): ByteArray {
        var arrCount = 0
        var count = 0
        for (array in arrays) {
            arrCount++
            count += array.size
        }

        // Create new array and copy all array contents
        val mergedArray = ByteArray(count)
        var start = 0
        for (array in arrays) {
            System.arraycopy(array, 0, mergedArray, start, array.size)
            start += array.size
        }
        return mergedArray
    }
}
