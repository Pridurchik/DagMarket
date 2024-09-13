package org.ailynx.base.common.resourse

import android.content.Context

//import javax.inject.Inject

class ResourceManagerImpl  constructor(
    private val context : Context
) : ResourceManager {
    override fun getString(resourceId: Int): String {
        return context.getString(resourceId)
    }

    override fun getColor(resourceId: Int): Int {
        return context.getColor(resourceId)
    }
}