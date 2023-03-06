package org.xmtp.android.example.conversation

import androidx.annotation.UiThread
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.xmtp.android.example.ClientManager
import org.xmtp.android.library.Conversation
import org.xmtp.android.library.DecodedMessage

class ConversationDetailViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val conversationTopicFlow = savedStateHandle.getStateFlow<String?>(
        ConversationDetailActivity.EXTRA_CONVERSATION_TOPIC,
        null
    )

    private val conversationTopic = conversationTopicFlow.value

    fun setConversationTopic(conversationTopic: String?) {
        savedStateHandle[ConversationDetailActivity.EXTRA_CONVERSATION_TOPIC] = conversationTopic
    }

    private val _uiState = MutableStateFlow<UiState>(UiState.Loading(null))
    val uiState: StateFlow<UiState> = _uiState

    private var conversation: Conversation? = null

    @UiThread
    fun fetchMessages() {
        when (val uiState = uiState.value) {
            is UiState.Success -> _uiState.value = UiState.Loading(uiState.listItems)
            else -> _uiState.value = UiState.Loading(null)
        }
        viewModelScope.launch(Dispatchers.IO) {
            val listItems = mutableListOf<MessageListItem>()
            try {
                if (conversation == null) {
                    conversation = ClientManager.client.fetchConversation(conversationTopic)
                }
                conversation?.let {
                    listItems.addAll(
                        it.messages().map { message ->
                            MessageListItem.Message(message.id, message)
                        }
                    )
                }
                _uiState.value = UiState.Success(listItems)
            } catch (e: Exception) {
                _uiState.value = UiState.Error(e.localizedMessage.orEmpty())
            }
        }
    }

    @UiThread
    fun sendMessage(body: String): StateFlow<SendMessageState> {
        val flow = MutableStateFlow<SendMessageState>(SendMessageState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                conversation?.send(body)
                flow.value = SendMessageState.Success
            } catch (e: Exception) {
                flow.value = SendMessageState.Error(e.localizedMessage.orEmpty())
            }
        }
        return flow
    }

    sealed class UiState {
        data class Loading(val listItems: List<MessageListItem>?) : UiState()
        data class Success(val listItems: List<MessageListItem>) : UiState()
        data class Error(val message: String) : UiState()
    }

    sealed class SendMessageState {
        object Loading : SendMessageState()
        object Success : SendMessageState()
        data class Error(val message: String) : SendMessageState()
    }

    sealed class MessageListItem(open val id: String, val itemType: Int) {
        companion object {
            const val ITEM_TYPE_MESSAGE = 1
        }

        data class Message(override val id: String, val message: DecodedMessage) :
            MessageListItem(id, ITEM_TYPE_MESSAGE)
    }
}
