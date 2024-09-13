package org.ailynx.base.repository

import org.ailynx.base.model.ModelRegist
import com.aichat.base.model.UserBaseModel

interface RegistUserRepository {
    suspend fun registUser(user: UserBaseModel) : ModelRegist
}