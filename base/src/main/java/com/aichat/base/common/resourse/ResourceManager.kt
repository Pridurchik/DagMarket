package org.ailynx.base.common.resourse

interface ResourceManager {
    fun getString(resourceId: Int): String
    fun getColor(resourceId: Int): Int
}