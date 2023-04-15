// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_api/v1/message_api.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_api.v1;

@kotlin.jvm.JvmName("-initializecursor")
public inline fun cursor(block: com.xmtp.message_api.v1.CursorKt.Dsl.() -> kotlin.Unit): com.xmtp.message_api.v1.Cursor =
  com.xmtp.message_api.v1.CursorKt.Dsl._create(com.xmtp.message_api.v1.Cursor.newBuilder()).apply { block() }._build()
/**
 * ```
 * Wrapper for potentially multiple types of cursor
 * ```
 *
 * Protobuf type `xmtp.message_api.v1.Cursor`
 */
public object CursorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_api.v1.Cursor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_api.v1.Cursor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_api.v1.Cursor = _builder.build()

    /**
     * `.xmtp.message_api.v1.IndexCursor index = 1 [json_name = "index"];`
     */
    public var index: com.xmtp.message_api.v1.IndexCursor
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * `.xmtp.message_api.v1.IndexCursor index = 1 [json_name = "index"];`
     */
    public fun clearIndex() {
      _builder.clearIndex()
    }
    /**
     * `.xmtp.message_api.v1.IndexCursor index = 1 [json_name = "index"];`
     * @return Whether the index field is set.
     */
    public fun hasIndex(): kotlin.Boolean {
      return _builder.hasIndex()
    }
    public val cursorCase: com.xmtp.message_api.v1.Cursor.CursorCase
      @JvmName("getCursorCase")
      get() = _builder.getCursorCase()

    public fun clearCursor() {
      _builder.clearCursor()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_api.v1.Cursor.copy(block: com.xmtp.message_api.v1.CursorKt.Dsl.() -> kotlin.Unit): com.xmtp.message_api.v1.Cursor =
  com.xmtp.message_api.v1.CursorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_api.v1.CursorOrBuilder.indexOrNull: com.xmtp.message_api.v1.IndexCursor?
  get() = if (hasIndex()) getIndex() else null

