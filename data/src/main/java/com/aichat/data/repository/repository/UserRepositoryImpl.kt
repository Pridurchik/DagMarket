package com.aichat.data.repository.repository

import com.aichat.base.repository.UserRepository
import com.aichat.base.model.UserBaseModel
import com.aichat.data.repository.storage.sharedPreferenceStorage.PreferenceStorage
import javax.inject.Inject


class UserRepositoryImpl @Inject constructor(
    var preferenceStorage: PreferenceStorage
): UserRepository {

    override fun saveUser(user: UserBaseModel) {
        preferenceStorage.setUser(user)
    }

    override fun getUser(): UserBaseModel? {
        return preferenceStorage.getUser()
    }

    override fun stateUser(): Boolean {
        return preferenceStorage.stateUser()
    }

    override fun exitUser(): Boolean {
        return preferenceStorage.exitUser()
    }
}