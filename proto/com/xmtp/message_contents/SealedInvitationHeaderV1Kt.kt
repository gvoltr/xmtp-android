// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: message_contents/invitation.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.xmtp.message_contents;

@kotlin.jvm.JvmName("-initializesealedInvitationHeaderV1")
public inline fun sealedInvitationHeaderV1(block: com.xmtp.message_contents.SealedInvitationHeaderV1Kt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SealedInvitationHeaderV1 =
  com.xmtp.message_contents.SealedInvitationHeaderV1Kt.Dsl._create(com.xmtp.message_contents.SealedInvitationHeaderV1.newBuilder()).apply { block() }._build()
/**
 * ```
 * Sealed Invitation V1 Header
 * Header carries information that is unencrypted, thus readable by the network
 * it is however authenticated as associated data with the AEAD scheme used
 * to encrypt the invitation body, thus providing tamper evidence.
 * ```
 *
 * Protobuf type `xmtp.message_contents.SealedInvitationHeaderV1`
 */
public object SealedInvitationHeaderV1Kt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.xmtp.message_contents.SealedInvitationHeaderV1.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.xmtp.message_contents.SealedInvitationHeaderV1.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.xmtp.message_contents.SealedInvitationHeaderV1 = _builder.build()

    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle sender = 1 [json_name = "sender"];`
     */
    public var sender: com.xmtp.message_contents.SignedPublicKeyBundle
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle sender = 1 [json_name = "sender"];`
     */
    public fun clearSender() {
      _builder.clearSender()
    }
    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle sender = 1 [json_name = "sender"];`
     * @return Whether the sender field is set.
     */
    public fun hasSender(): kotlin.Boolean {
      return _builder.hasSender()
    }

    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle recipient = 2 [json_name = "recipient"];`
     */
    public var recipient: com.xmtp.message_contents.SignedPublicKeyBundle
      @JvmName("getRecipient")
      get() = _builder.getRecipient()
      @JvmName("setRecipient")
      set(value) {
        _builder.setRecipient(value)
      }
    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle recipient = 2 [json_name = "recipient"];`
     */
    public fun clearRecipient() {
      _builder.clearRecipient()
    }
    /**
     * `.xmtp.message_contents.SignedPublicKeyBundle recipient = 2 [json_name = "recipient"];`
     * @return Whether the recipient field is set.
     */
    public fun hasRecipient(): kotlin.Boolean {
      return _builder.hasRecipient()
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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.xmtp.message_contents.SealedInvitationHeaderV1.copy(block: com.xmtp.message_contents.SealedInvitationHeaderV1Kt.Dsl.() -> kotlin.Unit): com.xmtp.message_contents.SealedInvitationHeaderV1 =
  com.xmtp.message_contents.SealedInvitationHeaderV1Kt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.xmtp.message_contents.SealedInvitationHeaderV1OrBuilder.senderOrNull: com.xmtp.message_contents.SignedPublicKeyBundle?
  get() = if (hasSender()) getSender() else null

public val com.xmtp.message_contents.SealedInvitationHeaderV1OrBuilder.recipientOrNull: com.xmtp.message_contents.SignedPublicKeyBundle?
  get() = if (hasRecipient()) getRecipient() else null

