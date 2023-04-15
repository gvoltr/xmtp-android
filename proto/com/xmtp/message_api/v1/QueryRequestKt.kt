// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_api/v1/message_api.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_api.v1;

@kotlin.jvm.JvmName("-initializequeryRequest")
public inline fun queryRequest(block: com.xmtp.message_api.v1.QueryRequestKt.Dsl.() -> kotlin.Unit): com.xmtp.message_api.v1.QueryRequest =
  com.xmtp.message_api.v1.QueryRequestKt.Dsl._create(com.xmtp.message_api.v1.QueryRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * Query
 * ```
 *
 * Protobuf type `xmtp.message_api.v1.QueryRequest`
 */
public object QueryRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_api.v1.QueryRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_api.v1.QueryRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_api.v1.QueryRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ContentTopicsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @return A list containing the contentTopics.
     */
    public val contentTopics: com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getContentTopicsList()
      )
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @param value The contentTopics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addContentTopics")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.add(value: kotlin.String) {
      _builder.addContentTopics(value)
    }
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @param value The contentTopics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignContentTopics")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @param values The contentTopics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllContentTopics")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllContentTopics(values)
    }
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @param values The contentTopics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllContentTopics")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     * @param index The index to set the value at.
     * @param value The contentTopics to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setContentTopics")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setContentTopics(index, value)
    }/**
     * `repeated string content_topics = 1 [json_name = "contentTopics"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearContentTopics")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ContentTopicsProxy>.clear() {
      _builder.clearContentTopics()
    }
    /**
     * `uint64 start_time_ns = 2 [json_name = "startTimeNs"];`
     */
    public var startTimeNs: kotlin.Long
      @JvmName("getStartTimeNs")
      get() = _builder.getStartTimeNs()
      @JvmName("setStartTimeNs")
      set(value) {
        _builder.setStartTimeNs(value)
      }
    /**
     * `uint64 start_time_ns = 2 [json_name = "startTimeNs"];`
     */
    public fun clearStartTimeNs() {
      _builder.clearStartTimeNs()
    }

    /**
     * `uint64 end_time_ns = 3 [json_name = "endTimeNs"];`
     */
    public var endTimeNs: kotlin.Long
      @JvmName("getEndTimeNs")
      get() = _builder.getEndTimeNs()
      @JvmName("setEndTimeNs")
      set(value) {
        _builder.setEndTimeNs(value)
      }
    /**
     * `uint64 end_time_ns = 3 [json_name = "endTimeNs"];`
     */
    public fun clearEndTimeNs() {
      _builder.clearEndTimeNs()
    }

    /**
     * `.xmtp.message_api.v1.PagingInfo paging_info = 4 [json_name = "pagingInfo"];`
     */
    public var pagingInfo: com.xmtp.message_api.v1.PagingInfo
      @JvmName("getPagingInfo")
      get() = _builder.getPagingInfo()
      @JvmName("setPagingInfo")
      set(value) {
        _builder.setPagingInfo(value)
      }
    /**
     * `.xmtp.message_api.v1.PagingInfo paging_info = 4 [json_name = "pagingInfo"];`
     */
    public fun clearPagingInfo() {
      _builder.clearPagingInfo()
    }
    /**
     * `.xmtp.message_api.v1.PagingInfo paging_info = 4 [json_name = "pagingInfo"];`
     * @return Whether the pagingInfo field is set.
     */
    public fun hasPagingInfo(): kotlin.Boolean {
      return _builder.hasPagingInfo()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_api.v1.QueryRequest.copy(block: com.xmtp.message_api.v1.QueryRequestKt.Dsl.() -> kotlin.Unit): com.xmtp.message_api.v1.QueryRequest =
  com.xmtp.message_api.v1.QueryRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_api.v1.QueryRequestOrBuilder.pagingInfoOrNull: com.xmtp.message_api.v1.PagingInfo?
  get() = if (hasPagingInfo()) getPagingInfo() else null

