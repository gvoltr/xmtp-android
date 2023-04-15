// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: keystore_api/v1/keystore.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.keystore_api.v1;

@kotlin.jvm.JvmName("-initializecreateAuthTokenRequest")
public inline fun createAuthTokenRequest(block: com.xmtp.keystore_api.v1.CreateAuthTokenRequestKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.CreateAuthTokenRequest =
  com.xmtp.keystore_api.v1.CreateAuthTokenRequestKt.Dsl._create(com.xmtp.keystore_api.v1.CreateAuthTokenRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * CreateAuthTokenRequest is used to create an auth token for the XMTP API
 * ```
 *
 * Protobuf type `xmtp.keystore_api.v1.CreateAuthTokenRequest`
 */
public object CreateAuthTokenRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.keystore_api.v1.CreateAuthTokenRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.keystore_api.v1.CreateAuthTokenRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.keystore_api.v1.CreateAuthTokenRequest = _builder.build()

    /**
     * `optional uint64 timestamp_ns = 1 [json_name = "timestampNs"];`
     */
    public var timestampNs: kotlin.Long
      @JvmName("getTimestampNs")
      get() = _builder.getTimestampNs()
      @JvmName("setTimestampNs")
      set(value) {
        _builder.setTimestampNs(value)
      }
    /**
     * `optional uint64 timestamp_ns = 1 [json_name = "timestampNs"];`
     */
    public fun clearTimestampNs() {
      _builder.clearTimestampNs()
    }
    /**
     * `optional uint64 timestamp_ns = 1 [json_name = "timestampNs"];`
     * @return Whether the timestampNs field is set.
     */
    public fun hasTimestampNs(): kotlin.Boolean {
      return _builder.hasTimestampNs()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.keystore_api.v1.CreateAuthTokenRequest.copy(block: com.xmtp.keystore_api.v1.CreateAuthTokenRequestKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.CreateAuthTokenRequest =
  com.xmtp.keystore_api.v1.CreateAuthTokenRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

