// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/conversation_reference.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializeconversationReference")
public inline fun conversationReference(block: com.xmtp.message_contents.ConversationReferenceKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.ConversationReference =
  com.xmtp.message_contents.ConversationReferenceKt.Dsl._create(com.xmtp.message_contents.ConversationReference.newBuilder()).apply { block() }._build()
/**
 * ```
 * A light pointer for a conversation that contains no decryption keys
 * ```
 *
 * Protobuf type `xmtp.message_contents.ConversationReference`
 */
public object ConversationReferenceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.ConversationReference.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.ConversationReference.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.ConversationReference = _builder.build()

    /**
     * `string topic = 1 [json_name = "topic"];`
     */
    public var topic: kotlin.String
      @JvmName("getTopic")
      get() = _builder.getTopic()
      @JvmName("setTopic")
      set(value) {
        _builder.setTopic(value)
      }
    /**
     * `string topic = 1 [json_name = "topic"];`
     */
    public fun clearTopic() {
      _builder.clearTopic()
    }

    /**
     * `string peer_address = 2 [json_name = "peerAddress"];`
     */
    public var peerAddress: kotlin.String
      @JvmName("getPeerAddress")
      get() = _builder.getPeerAddress()
      @JvmName("setPeerAddress")
      set(value) {
        _builder.setPeerAddress(value)
      }
    /**
     * `string peer_address = 2 [json_name = "peerAddress"];`
     */
    public fun clearPeerAddress() {
      _builder.clearPeerAddress()
    }

    /**
     * `uint64 created_ns = 3 [json_name = "createdNs"];`
     */
    public var createdNs: kotlin.Long
      @JvmName("getCreatedNs")
      get() = _builder.getCreatedNs()
      @JvmName("setCreatedNs")
      set(value) {
        _builder.setCreatedNs(value)
      }
    /**
     * `uint64 created_ns = 3 [json_name = "createdNs"];`
     */
    public fun clearCreatedNs() {
      _builder.clearCreatedNs()
    }

    /**
     * `.xmtp.message_contents.InvitationV1.Context context = 4 [json_name = "context"];`
     */
    public var context: com.xmtp.message_contents.InvitationV1.Context
      @JvmName("getContext")
      get() = _builder.getContext()
      @JvmName("setContext")
      set(value) {
        _builder.setContext(value)
      }
    /**
     * `.xmtp.message_contents.InvitationV1.Context context = 4 [json_name = "context"];`
     */
    public fun clearContext() {
      _builder.clearContext()
    }
    /**
     * `.xmtp.message_contents.InvitationV1.Context context = 4 [json_name = "context"];`
     * @return Whether the context field is set.
     */
    public fun hasContext(): kotlin.Boolean {
      return _builder.hasContext()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.ConversationReference.copy(block: com.xmtp.message_contents.ConversationReferenceKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.ConversationReference =
  com.xmtp.message_contents.ConversationReferenceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.ConversationReferenceOrBuilder.contextOrNull: com.xmtp.message_contents.InvitationV1.Context?
  get() = if (hasContext()) getContext() else null

