// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/composite.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializecomposite")
public inline fun composite(block: com.xmtp.message_contents.CompositeKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Composite =
  com.xmtp.message_contents.CompositeKt.Dsl._create(com.xmtp.message_contents.Composite.newBuilder()).apply { block() }._build()
/**
 * ```
 * Composite is used to implement xmtp.org/composite content type
 * ```
 *
 * Protobuf type `xmtp.message_contents.Composite`
 */
public object CompositeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.Composite.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.Composite.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.Composite = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PartsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     */
     public val parts: com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPartsList()
      )
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     * @param value The parts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addParts")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.add(value: com.xmtp.message_contents.Composite.Part) {
      _builder.addParts(value)
    }
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     * @param value The parts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignParts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.plusAssign(value: com.xmtp.message_contents.Composite.Part) {
      add(value)
    }
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     * @param values The parts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllParts")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.addAll(values: kotlin.collections.Iterable<com.xmtp.message_contents.Composite.Part>) {
      _builder.addAllParts(values)
    }
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     * @param values The parts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllParts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.plusAssign(values: kotlin.collections.Iterable<com.xmtp.message_contents.Composite.Part>) {
      addAll(values)
    }
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     * @param index The index to set the value at.
     * @param value The parts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setParts")
    public operator fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.set(index: kotlin.Int, value: com.xmtp.message_contents.Composite.Part) {
      _builder.setParts(index, value)
    }
    /**
     * `repeated .xmtp.message_contents.Composite.Part parts = 1 [json_name = "parts"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearParts")
    public fun com.google.protobuf.kotlin.DslList<com.xmtp.message_contents.Composite.Part, PartsProxy>.clear() {
      _builder.clearParts()
    }
  }
  @kotlin.jvm.JvmName("-initializepart")
  public inline fun part(block: com.xmtp.message_contents.CompositeKt.PartKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Composite.Part =
    com.xmtp.message_contents.CompositeKt.PartKt.Dsl._create(com.xmtp.message_contents.Composite.Part.newBuilder()).apply { block() }._build()
  /**
   * ```
   * Part represents one section of a composite message
   * ```
   *
   * Protobuf type `xmtp.message_contents.Composite.Part`
   */
  public object PartKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.xmtp.message_contents.Composite.Part.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.xmtp.message_contents.Composite.Part.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.xmtp.message_contents.Composite.Part = _builder.build()

      /**
       * `.xmtp.message_contents.EncodedContent part = 1 [json_name = "part"];`
       */
      public var part: com.xmtp.message_contents.EncodedContent
        @JvmName("getPart")
        get() = _builder.getPart()
        @JvmName("setPart")
        set(value) {
          _builder.setPart(value)
        }
      /**
       * `.xmtp.message_contents.EncodedContent part = 1 [json_name = "part"];`
       */
      public fun clearPart() {
        _builder.clearPart()
      }
      /**
       * `.xmtp.message_contents.EncodedContent part = 1 [json_name = "part"];`
       * @return Whether the part field is set.
       */
      public fun hasPart(): kotlin.Boolean {
        return _builder.hasPart()
      }

      /**
       * `.xmtp.message_contents.Composite composite = 2 [json_name = "composite"];`
       */
      public var composite: com.xmtp.message_contents.Composite
        @JvmName("getComposite")
        get() = _builder.getComposite()
        @JvmName("setComposite")
        set(value) {
          _builder.setComposite(value)
        }
      /**
       * `.xmtp.message_contents.Composite composite = 2 [json_name = "composite"];`
       */
      public fun clearComposite() {
        _builder.clearComposite()
      }
      /**
       * `.xmtp.message_contents.Composite composite = 2 [json_name = "composite"];`
       * @return Whether the composite field is set.
       */
      public fun hasComposite(): kotlin.Boolean {
        return _builder.hasComposite()
      }
      public val elementCase: com.xmtp.message_contents.Composite.Part.ElementCase
        @JvmName("getElementCase")
        get() = _builder.getElementCase()

      public fun clearElement() {
        _builder.clearElement()
      }
    }
  }
}
public inline fun com.xmtp.message_contents.Composite.copy(block: com.xmtp.message_contents.CompositeKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Composite =
  com.xmtp.message_contents.CompositeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public inline fun com.xmtp.message_contents.Composite.Part.copy(block: com.xmtp.message_contents.CompositeKt.PartKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.Composite.Part =
  com.xmtp.message_contents.CompositeKt.PartKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.Composite.PartOrBuilder.partOrNull: com.xmtp.message_contents.EncodedContent?
  get() = if (hasPart()) getPart() else null

public val com.xmtp.message_contents.Composite.PartOrBuilder.compositeOrNull: com.xmtp.message_contents.Composite?
  get() = if (hasComposite()) getComposite() else null

