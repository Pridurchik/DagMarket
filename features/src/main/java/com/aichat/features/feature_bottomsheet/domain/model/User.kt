package com.aichat.features.feature_auth.domain.model

import com.aichat.base.model.UserBaseModel


data class User(
    override val email: String,
    override val password: String
) : UserBaseModel
