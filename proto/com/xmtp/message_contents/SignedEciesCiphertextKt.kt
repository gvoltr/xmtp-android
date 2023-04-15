// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/ciphertext.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializesignedEciesCiphertext")
public inline fun signedEciesCiphertext(block: com.xmtp.message_contents.SignedEciesCiphertextKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SignedEciesCiphertext =
  com.xmtp.message_contents.SignedEciesCiphertextKt.Dsl._create(com.xmtp.message_contents.SignedEciesCiphertext.newBuilder()).apply { block() }._build()
/**
 * ```
 * SignedEciesCiphertext represents an ECIES encrypted payload and a signature
 * ```
 *
 * Protobuf type `xmtp.message_contents.SignedEciesCiphertext`
 */
public object SignedEciesCiphertextKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.SignedEciesCiphertext.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.SignedEciesCiphertext.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.SignedEciesCiphertext = _builder.build()

    /**
     * ```
     * serialized Ecies message
     * ```
     *
     * `bytes ecies_bytes = 1 [json_name = "eciesBytes"];`
     */
    public var eciesBytes: com.google.protobuf.ByteString
      @JvmName("getEciesBytes")
      get() = _builder.getEciesBytes()
      @JvmName("setEciesBytes")
      set(value) {
        _builder.setEciesBytes(value)
      }
    /**
     * ```
     * serialized Ecies message
     * ```
     *
     * `bytes ecies_bytes = 1 [json_name = "eciesBytes"];`
     */
    public fun clearEciesBytes() {
      _builder.clearEciesBytes()
    }

    /**
     * ```
     * signature of sha256(ecies_bytes) signed with the IdentityKey
     * ```
     *
     * `.xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     */
    public var signature: com.xmtp.message_contents.Signature
      @JvmName("getSignature")
      get() = _builder.getSignature()
      @JvmName("setSignature")
      set(value) {
        _builder.setSignature(value)
      }
    /**
     * ```
     * signature of sha256(ecies_bytes) signed with the IdentityKey
     * ```
     *
     * `.xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     */
    public fun clearSignature() {
      _builder.clearSignature()
    }
    /**
     * ```
     * signature of sha256(ecies_bytes) signed with the IdentityKey
     * ```
     *
     * `.xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     * @return Whether the signature field is set.
     */
    public fun hasSignature(): kotlin.Boolean {
      return _builder.hasSignature()
    }
  }
  @kotlin.jvm.JvmName("-initializeecies")
  public inline fun ecies(block: com.xmtp.message_contents.SignedEciesCiphertextKt.EciesKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SignedEciesCiphertext.Ecies =
    com.xmtp.message_contents.SignedEciesCiphertextKt.EciesKt.Dsl._create(com.xmtp.message_contents.SignedEciesCiphertext.Ecies.newBuilder()).apply { block() }._build()
  /**
   * ```
   * Ecies is ciphertext encrypted using ECIES with a MAC
   * ```
   *
   * Protobuf type `xmtp.message_contents.SignedEciesCiphertext.Ecies`
   */
  public object EciesKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.xmtp.message_contents.SignedEciesCiphertext.Ecies.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.xmtp.message_contents.SignedEciesCiphertext.Ecies.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.xmtp.message_contents.SignedEciesCiphertext.Ecies = _builder.build()

      /**
       * ```
       * 65 bytes
       * ```
       *
       * `bytes ephemeral_public_key = 1 [json_name = "ephemeralPublicKey"];`
       */
      public var ephemeralPublicKey: com.google.protobuf.ByteString
        @JvmName("getEphemeralPublicKey")
        get() = _builder.getEphemeralPublicKey()
        @JvmName("setEphemeralPublicKey")
        set(value) {
          _builder.setEphemeralPublicKey(value)
        }
      /**
       * ```
       * 65 bytes
       * ```
       *
       * `bytes ephemeral_public_key = 1 [json_name = "ephemeralPublicKey"];`
       */
      public fun clearEphemeralPublicKey() {
        _builder.clearEphemeralPublicKey()
      }

      /**
       * ```
       * 16 bytes
       * ```
       *
       * `bytes iv = 2 [json_name = "iv"];`
       */
      public var iv: com.google.protobuf.ByteString
        @JvmName("getIv")
        get() = _builder.getIv()
        @JvmName("setIv")
        set(value) {
          _builder.setIv(value)
        }
      /**
       * ```
       * 16 bytes
       * ```
       *
       * `bytes iv = 2 [json_name = "iv"];`
       */
      public fun clearIv() {
        _builder.clearIv()
      }

      /**
       * ```
       * 32 bytes
       * ```
       *
       * `bytes mac = 3 [json_name = "mac"];`
       */
      public var mac: com.google.protobuf.ByteString
        @JvmName("getMac")
        get() = _builder.getMac()
        @JvmName("setMac")
        set(value) {
          _builder.setMac(value)
        }
      /**
       * ```
       * 32 bytes
       * ```
       *
       * `bytes mac = 3 [json_name = "mac"];`
       */
      public fun clearMac() {
        _builder.clearMac()
      }

      /**
       * ```
       * encrypted payload with block size of 16
       * ```
       *
       * `bytes ciphertext = 4 [json_name = "ciphertext"];`
       */
      public var ciphertext: com.google.protobuf.ByteString
        @JvmName("getCiphertext")
        get() = _builder.getCiphertext()
        @JvmName("setCiphertext")
        set(value) {
          _builder.setCiphertext(value)
        }
      /**
       * ```
       * encrypted payload with block size of 16
       * ```
       *
       * `bytes ciphertext = 4 [json_name = "ciphertext"];`
       */
      public fun clearCiphertext() {
        _builder.clearCiphertext()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.SignedEciesCiphertext.copy(block: com.xmtp.message_contents.SignedEciesCiphertextKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SignedEciesCiphertext =
  com.xmtp.message_contents.SignedEciesCiphertextKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.SignedEciesCiphertext.Ecies.copy(block: com.xmtp.message_contents.SignedEciesCiphertextKt.EciesKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SignedEciesCiphertext.Ecies =
  com.xmtp.message_contents.SignedEciesCiphertextKt.EciesKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.SignedEciesCiphertextOrBuilder.signatureOrNull: com.xmtp.message_contents.Signature?
  get() = if (hasSignature()) getSignature() else null

