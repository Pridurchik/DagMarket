package com.aichat.base.repository

import com.aichat.base.model.UserBaseModel

interface UserRepository {
    fun saveUser(user: UserBaseModel)
    fun getUser() : UserBaseModel?
    fun stateUser() : Boolean

    fun exitUser() : Boolean
}