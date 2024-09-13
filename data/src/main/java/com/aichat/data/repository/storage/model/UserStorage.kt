package com.aichat.data.rerepository.storage.model

import com.aichat.base.model.UserBaseModel

data class UserStorage(
    override val email: String,
    override val password: String,
) : UserBaseModel