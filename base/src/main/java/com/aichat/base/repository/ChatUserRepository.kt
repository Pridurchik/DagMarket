package org.ailynx.base.repository

import org.ailynx.base.model.chat_model.model_chat.ModelChat
import com.aichat.base.model.UserBaseModel
import org.ailynx.base.model.chat_model.model_chat.AllMessagesChatModel
import org.ailynx.base.model.chat_model.model_chat.FormOfPaymentModel
import org.ailynx.base.model.chat_model.model_chat.RenameChatModel
import org.ailynx.base.model.chat_model.model_chat_question.ModelChatQuestion
import org.ailynx.base.model.chat_model.model_current_chat_question.CurrentChatQuestionModel

interface ChatUserRepository {
    suspend fun chatUser(user: UserBaseModel?): ModelChat
    suspend fun chatQuestionUser(user: UserBaseModel?, text: String): ModelChatQuestion
    suspend fun chatQuestionUserCurrentChat(user: UserBaseModel?, chat: String, text: String) : CurrentChatQuestionModel
    suspend fun getAllMessagesChat(user: UserBaseModel?, chat: String) : AllMessagesChatModel
    suspend fun renameChat(user: UserBaseModel?, chat: String, name: String) : RenameChatModel
    suspend fun formOfPayment() : FormOfPaymentModel
}