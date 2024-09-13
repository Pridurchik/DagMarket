package com.aichat.data.repository.storage.sharedPreferenceStorage

import android.content.Context
import org.ailynx.base.common.constant.Constant
import com.aichat.base.model.UserBaseModel
import com.aichat.data.rerepository.storage.model.UserStorage
import org.ailynx.base.base.BaseStorage
import javax.inject.Inject

class PreferenceStorage @Inject constructor(
     context: Context
) : BaseStorage<UserBaseModel>(context) {


    override fun setUser(user: UserBaseModel) {
        preference.edit()
            .putString(Constant.USER_EMAIL_KEY, user.email)
            .putString(Constant.USER_PASSWORD_KEY, user.password)
            .apply()
    }

    override fun getUser(): UserStorage {
        return UserStorage(
            preference.getString(Constant.USER_EMAIL_KEY, Constant.USER_IS_NOT_FOUNDED).toString(),
            preference.getString(Constant.USER_PASSWORD_KEY, Constant.USER_IS_NOT_FOUNDED).toString()
        )
    }

    override fun stateUser(): Boolean {
        return preference.getString(Constant.USER_EMAIL_KEY, Constant.USER_IS_NOT_FOUNDED).toString() != Constant.USER_IS_NOT_FOUNDED &&
                preference.getString(Constant.USER_PASSWORD_KEY, Constant.USER_IS_NOT_FOUNDED).toString() != Constant.USER_IS_NOT_FOUNDED
    }

    override fun exitUser(): Boolean {
        preference.edit()
            .clear()
            .apply()

        return true
    }

}