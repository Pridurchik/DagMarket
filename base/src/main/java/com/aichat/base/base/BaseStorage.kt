package org.ailynx.base.base

import android.content.Context
import android.content.SharedPreferences
import com.aichat.base.base.StorageClass
import org.ailynx.base.common.constant.Constant

abstract class BaseStorage<UM> (
    private val context: Context
) : StorageClass<UM> {


    protected val preference: SharedPreferences by lazy {
        context.getSharedPreferences(Constant.SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE)
    }

}