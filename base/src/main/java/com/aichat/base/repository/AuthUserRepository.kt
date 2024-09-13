package org.ailynx.base.repository

import org.ailynx.base.model.chat_model.model_chat.ModelChat
import com.aichat.base.model.UserBaseModel

interface AuthUserRepository {

    suspend fun authUser(user: UserBaseModel): ModelChat
}