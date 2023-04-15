// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/message.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializedecodedMessage")
public inline fun decodedMessage(block: com.xmtp.message_contents.DecodedMessageKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.DecodedMessage =
  com.xmtp.message_contents.DecodedMessageKt.Dsl._create(com.xmtp.message_contents.DecodedMessage.newBuilder()).apply { block() }._build()
/**
 * ```
 * DecodedMessage represents the decrypted message contents.
 * DecodedMessage instances are not stored on the network, but
 * may be serialized and stored by clients
 * ```
 *
 * Protobuf type `xmtp.message_contents.DecodedMessage`
 */
public object DecodedMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.DecodedMessage.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.DecodedMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.DecodedMessage = _builder.build()

    /**
     * `string id = 1 [json_name = "id"];`
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * `string id = 1 [json_name = "id"];`
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * `string message_version = 2 [json_name = "messageVersion"];`
     */
    public var messageVersion: kotlin.String
      @JvmName("getMessageVersion")
      get() = _builder.getMessageVersion()
      @JvmName("setMessageVersion")
      set(value) {
        _builder.setMessageVersion(value)
      }
    /**
     * `string message_version = 2 [json_name = "messageVersion"];`
     */
    public fun clearMessageVersion() {
      _builder.clearMessageVersion()
    }

    /**
     * `string sender_address = 3 [json_name = "senderAddress"];`
     */
    public var senderAddress: kotlin.String
      @JvmName("getSenderAddress")
      get() = _builder.getSenderAddress()
      @JvmName("setSenderAddress")
      set(value) {
        _builder.setSenderAddress(value)
      }
    /**
     * `string sender_address = 3 [json_name = "senderAddress"];`
     */
    public fun clearSenderAddress() {
      _builder.clearSenderAddress()
    }

    /**
     * `optional string recipient_address = 4 [json_name = "recipientAddress"];`
     */
    public var recipientAddress: kotlin.String
      @JvmName("getRecipientAddress")
      get() = _builder.getRecipientAddress()
      @JvmName("setRecipientAddress")
      set(value) {
        _builder.setRecipientAddress(value)
      }
    /**
     * `optional string recipient_address = 4 [json_name = "recipientAddress"];`
     */
    public fun clearRecipientAddress() {
      _builder.clearRecipientAddress()
    }
    /**
     * `optional string recipient_address = 4 [json_name = "recipientAddress"];`
     * @return Whether the recipientAddress field is set.
     */
    public fun hasRecipientAddress(): kotlin.Boolean {
      return _builder.hasRecipientAddress()
    }

    /**
     * <code>uint64 sent_ns = 5 [json_name = "sentNs"];</code>
     */
    public var sentNs: kotlin.Long
      @JvmName("getSentNs")
      get() = _builder.getSentNs()
      @JvmName("setSentNs")
      set(value) {
        _builder.setSentNs(value)
      }
    /**
     * `uint64 sent_ns = 5 [json_name = "sentNs"];`
     */
    public fun clearSentNs() {
      _builder.clearSentNs()
    }

    /**
     * `string content_topic = 6 [json_name = "contentTopic"];`
     */
    public var contentTopic: kotlin.String
      @JvmName("getContentTopic")
      get() = _builder.getContentTopic()
      @JvmName("setContentTopic")
      set(value) {
        _builder.setContentTopic(value)
      }
    /**
     * `string content_topic = 6 [json_name = "contentTopic"];`
     */
    public fun clearContentTopic() {
      _builder.clearContentTopic()
    }

    /**
     * `.xmtp.message_contents.ConversationReference conversation = 7 [json_name = "conversation"];`
     */
    public var conversation: com.xmtp.message_contents.ConversationReference
      @JvmName("getConversation")
      get() = _builder.getConversation()
      @JvmName("setConversation")
      set(value) {
        _builder.setConversation(value)
      }
    /**
     * `.xmtp.message_contents.ConversationReference conversation = 7 [json_name = "conversation"];`
     */
    public fun clearConversation() {
      _builder.clearConversation()
    }
    /**
     * `.xmtp.message_contents.ConversationReference conversation = 7 [json_name = "conversation"];`
     * @return Whether the conversation field is set.
     */
    public fun hasConversation(): kotlin.Boolean {
      return _builder.hasConversation()
    }

    /**
     * <pre>
     * encapsulates EncodedContent
     * </pre>
     *
     * <code>bytes content_bytes = 8 [json_name = "contentBytes"];</code>
     */
    public var contentBytes: com.google.protobuf.ByteString
      @JvmName("getContentBytes")
      get() = _builder.getContentBytes()
      @JvmName("setContentBytes")
      set(value) {
        _builder.setContentBytes(value)
      }
    /**
     * ```
     * encapsulates EncodedContent
     * ```
     *
     * `bytes content_bytes = 8 [json_name = "contentBytes"];`
     */
    public fun clearContentBytes() {
      _builder.clearContentBytes()
    }
  }
}
public inline fun com.xmtp.message_contents.DecodedMessage.copy(block: com.xmtp.message_contents.DecodedMessageKt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.DecodedMessage =
  com.xmtp.message_contents.DecodedMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.DecodedMessageOrBuilder.conversationOrNull: com.xmtp.message_contents.ConversationReference?
  get() = if (hasConversation()) getConversation() else null

