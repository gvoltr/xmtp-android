// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/ciphertext.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializeciphertext")
public inline fun ciphertext(block: com.xmtp.message_contents.CiphertextKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Ciphertext =
  com.xmtp.message_contents.CiphertextKt.Dsl._create(com.xmtp.message_contents.Ciphertext.newBuilder()).apply { block() }._build()
/**
 * ```
 * Ciphertext represents encrypted payload.
 * It is definited as a union to support cryptographic algorithm agility.
 * The payload is accompanied by the cryptographic parameters
 * required by the chosen encryption scheme.
 * ```
 *
 * Protobuf type `xmtp.message_contents.Ciphertext`
 */
public object CiphertextKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.Ciphertext.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.Ciphertext.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.Ciphertext = _builder.build()

    /**
     * `.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 aes256_gcm_hkdf_sha256 = 1 [json_name = "aes256GcmHkdfSha256"];`
     */
    public var aes256GcmHkdfSha256: com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256
      @JvmName("getAes256GcmHkdfSha256")
      get() = _builder.getAes256GcmHkdfSha256()
      @JvmName("setAes256GcmHkdfSha256")
      set(value) {
        _builder.setAes256GcmHkdfSha256(value)
      }
    /**
     * `.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 aes256_gcm_hkdf_sha256 = 1 [json_name = "aes256GcmHkdfSha256"];`
     */
    public fun clearAes256GcmHkdfSha256() {
      _builder.clearAes256GcmHkdfSha256()
    }
    /**
     * `.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 aes256_gcm_hkdf_sha256 = 1 [json_name = "aes256GcmHkdfSha256"];`
     * @return Whether the aes256GcmHkdfSha256 field is set.
     */
    public fun hasAes256GcmHkdfSha256(): kotlin.Boolean {
      return _builder.hasAes256GcmHkdfSha256()
    }
    public val unionCase: com.xmtp.message_contents.Ciphertext.UnionCase
      @JvmName("getUnionCase")
      get() = _builder.getUnionCase()

    public fun clearUnion() {
      _builder.clearUnion()
    }
  }
  @kotlin.jvm.JvmName("-initializeaes256gcmHkdfsha256")
  public inline fun aes256gcmHkdfsha256(block: com.xmtp.message_contents.CiphertextKt.Aes256gcmHkdfsha256Kt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 =
    com.xmtp.message_contents.CiphertextKt.Aes256gcmHkdfsha256Kt.Dsl._create(com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256.newBuilder()).apply { block() }._build()
  /**
   * ```
   * Encryption: AES256-GCM
   * Key derivation function: HKDF-SHA256
   * ```
   *
   * Protobuf type `xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256`
   */
  public object Aes256gcmHkdfsha256Kt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 = _builder.build()

      /**
       * ```
       * 32 bytes
       * ```
       *
       * `bytes hkdf_salt = 1 [json_name = "hkdfSalt"];`
       */
      public var hkdfSalt: com.google.protobuf.ByteString
        @JvmName("getHkdfSalt")
        get() = _builder.getHkdfSalt()
        @JvmName("setHkdfSalt")
        set(value) {
          _builder.setHkdfSalt(value)
        }
      /**
       * ```
       * 32 bytes
       * ```
       *
       * `bytes hkdf_salt = 1 [json_name = "hkdfSalt"];`
       */
      public fun clearHkdfSalt() {
        _builder.clearHkdfSalt()
      }

      /**
       * ```
       * 12 bytes
       * ```
       *
       * `bytes gcm_nonce = 2 [json_name = "gcmNonce"];`
       */
      public var gcmNonce: com.google.protobuf.ByteString
        @JvmName("getGcmNonce")
        get() = _builder.getGcmNonce()
        @JvmName("setGcmNonce")
        set(value) {
          _builder.setGcmNonce(value)
        }
      /**
       * ```
       * 12 bytes
       * ```
       *
       * `bytes gcm_nonce = 2 [json_name = "gcmNonce"];`
       */
      public fun clearGcmNonce() {
        _builder.clearGcmNonce()
      }

      /**
       * ```
       * encrypted payload
       * ```
       *
       * `bytes payload = 3 [json_name = "payload"];`
       */
      public var payload: com.google.protobuf.ByteString
        @JvmName("getPayload")
        get() = _builder.getPayload()
        @JvmName("setPayload")
        set(value) {
          _builder.setPayload(value)
        }
      /**
       * ```
       * encrypted payload
       * ```
       *
       * `bytes payload = 3 [json_name = "payload"];`
       */
      public fun clearPayload() {
        _builder.clearPayload()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.Ciphertext.copy(block: com.xmtp.message_contents.CiphertextKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Ciphertext =
  com.xmtp.message_contents.CiphertextKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256.copy(block: com.xmtp.message_contents.CiphertextKt.Aes256gcmHkdfsha256Kt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256 =
  com.xmtp.message_contents.CiphertextKt.Aes256gcmHkdfsha256Kt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.CiphertextOrBuilder.aes256GcmHkdfSha256OrNull: com.xmtp.message_contents.Ciphertext.Aes256gcmHkdfsha256?
  get() = if (hasAes256GcmHkdfSha256()) getAes256GcmHkdfSha256() else null

