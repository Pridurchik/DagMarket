package org.ailynx.base.repository

import com.aichat.base.model.UserBaseModel
import org.ailynx.base.model.chat_model.model_chat.ModelChat

interface MenuChatRepository {
    suspend fun updateChat(user: UserBaseModel) : ModelChat
}