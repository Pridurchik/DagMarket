package com.aichat.data.rerepository.model

import com.aichat.base.base.BaseBody

data class RenameChatBody(
    override val em: String,
    override val pass: String,
    val chat : Long,
    val name: String
) : BaseBody
