// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/public_key.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializepublicKey")
public inline fun publicKey(block: com.xmtp.message_contents.PublicKeyKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.PublicKey =
  com.xmtp.message_contents.PublicKeyKt.Dsl._create(com.xmtp.message_contents.PublicKey.newBuilder()).apply { block() }._build()
/**
 * ```
 * PublicKey represents a generalized public key,
 * defined as a union to support cryptographic algorithm agility.
 * ```
 *
 * Protobuf type `xmtp.message_contents.PublicKey`
 */
public object PublicKeyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.PublicKey.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.PublicKey.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.PublicKey = _builder.build()

    /**
     * `uint64 timestamp = 1 [json_name = "timestamp"];`
     */
    public var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * `uint64 timestamp = 1 [json_name = "timestamp"];`
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }

    /**
     * `optional .xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     */
    public var signature: com.xmtp.message_contents.Signature
      @JvmName("getSignature")
      get() = _builder.getSignature()
      @JvmName("setSignature")
      set(value) {
        _builder.setSignature(value)
      }
    /**
     * `optional .xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     */
    public fun clearSignature() {
      _builder.clearSignature()
    }
    /**
     * `optional .xmtp.message_contents.Signature signature = 2 [json_name = "signature"];`
     * @return Whether the signature field is set.
     */
    public fun hasSignature(): kotlin.Boolean {
      return _builder.hasSignature()
    }
    public val PublicKeyKt.Dsl.signatureOrNull: com.xmtp.message_contents.Signature?
      get() = _builder.signatureOrNull

    /**
     * `.xmtp.message_contents.PublicKey.Secp256k1Uncompressed secp256k1_uncompressed = 3 [json_name = "secp256k1Uncompressed"];`
     */
    public var secp256K1Uncompressed: com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed
      @JvmName("getSecp256K1Uncompressed")
      get() = _builder.getSecp256K1Uncompressed()
      @JvmName("setSecp256K1Uncompressed")
      set(value) {
        _builder.setSecp256K1Uncompressed(value)
      }
    /**
     * `.xmtp.message_contents.PublicKey.Secp256k1Uncompressed secp256k1_uncompressed = 3 [json_name = "secp256k1Uncompressed"];`
     */
    public fun clearSecp256K1Uncompressed() {
      _builder.clearSecp256K1Uncompressed()
    }
    /**
     * `.xmtp.message_contents.PublicKey.Secp256k1Uncompressed secp256k1_uncompressed = 3 [json_name = "secp256k1Uncompressed"];`
     * @return Whether the secp256k1Uncompressed field is set.
     */
    public fun hasSecp256K1Uncompressed(): kotlin.Boolean {
      return _builder.hasSecp256K1Uncompressed()
    }
    public val unionCase: com.xmtp.message_contents.PublicKey.UnionCase
      @JvmName("getUnionCase")
      get() = _builder.getUnionCase()

    public fun clearUnion() {
      _builder.clearUnion()
    }
  }
  @kotlin.jvm.JvmName("-initializesecp256k1Uncompressed")
  public inline fun secp256k1Uncompressed(block: com.xmtp.message_contents.PublicKeyKt.Secp256k1UncompressedKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed =
    com.xmtp.message_contents.PublicKeyKt.Secp256k1UncompressedKt.Dsl._create(com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed.newBuilder()).apply { block() }._build()
  /**
   * ```
   * The key bytes
   * ```
   *
   * Protobuf type `xmtp.message_contents.PublicKey.Secp256k1Uncompressed`
   */
  public object Secp256k1UncompressedKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed = _builder.build()

      /**
       * ```
       * uncompressed point with prefix (0x04) [ P || X || Y ], 65 bytes
       * ```
       *
       * `bytes bytes = 1 [json_name = "bytes"];`
       */
      public var bytes: com.google.protobuf.ByteString
        @JvmName("getBytes")
        get() = _builder.getBytes()
        @JvmName("setBytes")
        set(value) {
          _builder.setBytes(value)
        }
      /**
       * ```
       * uncompressed point with prefix (0x04) [ P || X || Y ], 65 bytes
       * ```
       *
       * `bytes bytes = 1 [json_name = "bytes"];`
       */
      public fun clearBytes() {
        _builder.clearBytes()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.PublicKey.copy(block: com.xmtp.message_contents.PublicKeyKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.PublicKey =
  com.xmtp.message_contents.PublicKeyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed.copy(block: com.xmtp.message_contents.PublicKeyKt.Secp256k1UncompressedKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed =
  com.xmtp.message_contents.PublicKeyKt.Secp256k1UncompressedKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.PublicKeyOrBuilder.signatureOrNull: com.xmtp.message_contents.Signature?
  get() = if (hasSignature()) getSignature() else null

public val com.xmtp.message_contents.PublicKeyOrBuilder.secp256K1UncompressedOrNull: com.xmtp.message_contents.PublicKey.Secp256k1Uncompressed?
  get() = if (hasSecp256K1Uncompressed()) getSecp256K1Uncompressed() else null

