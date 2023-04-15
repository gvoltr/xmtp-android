// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: keystore_api/v1/keystore.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.keystore_api.v1;

@kotlin.jvm.JvmName("-initializeencryptResponse")
public inline fun encryptResponse(block: com.xmtp.keystore_api.v1.EncryptResponseKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse =
  com.xmtp.keystore_api.v1.EncryptResponseKt.Dsl._create(com.xmtp.keystore_api.v1.EncryptResponse.newBuilder()).apply { block() }._build()
/**
 * ```
 * Response type for both V1 and V2 encryption requests
 * ```
 *
 * Protobuf type `xmtp.keystore_api.v1.EncryptResponse`
 */
public object EncryptResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.keystore_api.v1.EncryptResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.keystore_api.v1.EncryptResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.keystore_api.v1.EncryptResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ResponsesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     */
     public val responses: com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getResponsesList()
      )
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     * @param value The responses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addResponses")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.add(value: com.xmtp.keystore_api.v1.EncryptResponse.Response) {
      _builder.addResponses(value)
    }
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     * @param value The responses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.plusAssign(value: com.xmtp.keystore_api.v1.EncryptResponse.Response) {
      add(value)
    }
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     * @param values The responses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllResponses")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.addAll(values: kotlin.collections.Iterable<com.xmtp.keystore_api.v1.EncryptResponse.Response>) {
      _builder.addAllResponses(values)
    }
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     * @param values The responses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.plusAssign(values: kotlin.collections.Iterable<com.xmtp.keystore_api.v1.EncryptResponse.Response>) {
      addAll(values)
    }
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     * @param index The index to set the value at.
     * @param value The responses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setResponses")
    public operator fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.set(index: kotlin.Int, value: com.xmtp.keystore_api.v1.EncryptResponse.Response) {
      _builder.setResponses(index, value)
    }
    /**
     * `repeated .xmtp.keystore_api.v1.EncryptResponse.Response responses = 1 [json_name = "responses"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearResponses")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.keystore_api.v1.EncryptResponse.Response, ResponsesProxy>.clear() {
      _builder.clearResponses()
    }

  }
  @kotlin.jvm.JvmName("-initializeresponse")
  public inline fun response(block: com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse.Response =
    com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.Dsl._create(com.xmtp.keystore_api.v1.EncryptResponse.Response.newBuilder()).apply { block() }._build()
  /**
   * ```
   * A single encryption response
   * ```
   *
   * Protobuf type `xmtp.keystore_api.v1.EncryptResponse.Response`
   */
  public object ResponseKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.xmtp.keystore_api.v1.EncryptResponse.Response.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.xmtp.keystore_api.v1.EncryptResponse.Response.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.xmtp.keystore_api.v1.EncryptResponse.Response = _builder.build()

      /**
       * `.xmtp.keystore_api.v1.EncryptResponse.Response.Success result = 1 [json_name = "result"];`
       */
      public var result: com.xmtp.keystore_api.v1.EncryptResponse.Response.Success
        @JvmName("getResult")
        get() = _builder.getResult()
        @JvmName("setResult")
        set(value) {
          _builder.setResult(value)
        }
      /**
       * `.xmtp.keystore_api.v1.EncryptResponse.Response.Success result = 1 [json_name = "result"];`
       */
      public fun clearResult() {
        _builder.clearResult()
      }
      /**
       * `.xmtp.keystore_api.v1.EncryptResponse.Response.Success result = 1 [json_name = "result"];`
       * @return Whether the result field is set.
       */
      public fun hasResult(): kotlin.Boolean {
        return _builder.hasResult()
      }

      /**
       * `.xmtp.keystore_api.v1.KeystoreError error = 2 [json_name = "error"];`
       */
      public var error: com.xmtp.keystore_api.v1.KeystoreError
        @JvmName("getError")
        get() = _builder.getError()
        @JvmName("setError")
        set(value) {
          _builder.setError(value)
        }
      /**
       * `.xmtp.keystore_api.v1.KeystoreError error = 2 [json_name = "error"];`
       */
      public fun clearError() {
        _builder.clearError()
      }
      /**
       * `.xmtp.keystore_api.v1.KeystoreError error = 2 [json_name = "error"];`
       * @return Whether the error field is set.
       */
      public fun hasError(): kotlin.Boolean {
        return _builder.hasError()
      }
      public val responseCase: com.xmtp.keystore_api.v1.EncryptResponse.Response.ResponseCase
        @JvmName("getResponseCase")
        get() = _builder.getResponseCase()

      public fun clearResponse() {
        _builder.clearResponse()
      }
    }
    @kotlin.jvm.JvmName("-initializesuccess")
    public inline fun success(block: com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.SuccessKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse.Response.Success =
      com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.SuccessKt.Dsl._create(com.xmtp.keystore_api.v1.EncryptResponse.Response.Success.newBuilder()).apply { block() }._build()
    /**
     * ```
     * Wrapper object for success response
     * ```
     *
     * Protobuf type `xmtp.keystore_api.v1.EncryptResponse.Response.Success`
     */
    public object SuccessKt {
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      @com.google.protobuf.kotlin.ProtoDslMarker
      public class Dsl private constructor(
        private val _builder: com.xmtp.keystore_api.v1.EncryptResponse.Response.Success.Builder
      ) {
        public companion object {
          @kotlin.jvm.JvmSynthetic
          @kotlin.PublishedApi
          internal fun _create(builder: com.xmtp.keystore_api.v1.EncryptResponse.Response.Success.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.xmtp.keystore_api.v1.EncryptResponse.Response.Success = _builder.build()

        /**
         * `.xmtp.message_contents.Ciphertext encrypted = 1 [json_name = "encrypted"];`
         */
        public var encrypted: com.xmtp.message_contents.Ciphertext
          @JvmName("getEncrypted")
          get() = _builder.getEncrypted()
          @JvmName("setEncrypted")
          set(value) {
            _builder.setEncrypted(value)
          }
        /**
         * `.xmtp.message_contents.Ciphertext encrypted = 1 [json_name = "encrypted"];`
         */
        public fun clearEncrypted() {
          _builder.clearEncrypted()
        }
        /**
         * `.xmtp.message_contents.Ciphertext encrypted = 1 [json_name = "encrypted"];`
         * @return Whether the encrypted field is set.
         */
        public fun hasEncrypted(): kotlin.Boolean {
          return _builder.hasEncrypted()
        }
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.keystore_api.v1.EncryptResponse.copy(block: com.xmtp.keystore_api.v1.EncryptResponseKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse =
  com.xmtp.keystore_api.v1.EncryptResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.keystore_api.v1.EncryptResponse.Response.copy(block: com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse.Response =
  com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.keystore_api.v1.EncryptResponse.Response.Success.copy(block: com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.SuccessKt.Dsl.() -> kotlin.Unit): com.xmtp.keystore_api.v1.EncryptResponse.Response.Success =
  com.xmtp.keystore_api.v1.EncryptResponseKt.ResponseKt.SuccessKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.keystore_api.v1.EncryptResponse.Response.SuccessOrBuilder.encryptedOrNull: com.xmtp.message_contents.Ciphertext?
  get() = if (hasEncrypted()) getEncrypted() else null

public val com.xmtp.keystore_api.v1.EncryptResponse.ResponseOrBuilder.resultOrNull: com.xmtp.keystore_api.v1.EncryptResponse.Response.Success?
  get() = if (hasResult()) getResult() else null

public val com.xmtp.keystore_api.v1.EncryptResponse.ResponseOrBuilder.errorOrNull: com.xmtp.keystore_api.v1.KeystoreError?
  get() = if (hasError()) getError() else null

