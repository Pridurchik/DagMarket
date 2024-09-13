package org.ailynx.base.repository

import com.aichat.base.model.UserBaseModel
import org.ailynx.base.model.change_pass.ChangePassAnswerModel
import org.ailynx.base.model.change_pass.CheckEmailRequestModel
import org.ailynx.base.model.change_pass.MailSmsRequestModel

interface ChangePassRepository {
    suspend fun sendEmailRequest(user: UserBaseModel) : MailSmsRequestModel
    suspend fun checkEmailRequest(user: UserBaseModel, code: Int) : CheckEmailRequestModel
    suspend fun changePass(user: UserBaseModel, new_pass: String) : ChangePassAnswerModel

}