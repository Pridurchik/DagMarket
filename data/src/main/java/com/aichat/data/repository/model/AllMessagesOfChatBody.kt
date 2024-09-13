package com.aichat.data.repository.model

import com.aichat.base.base.BaseBody


data class AllMessagesOfChatBody(
    override val em: String,
    override val pass: String,
    val chat : String
) : BaseBody
