package com.aichat.data.rerepository.model

import com.aichat.base.base.BaseBody

data class CurrentChatQuestionBody(
    override val em: String,
    override val pass: String,
    val chat: String,
    val text: String
): BaseBody
