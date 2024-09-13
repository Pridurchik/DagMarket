package com.aichat.data.rerepository.model

import com.aichat.base.base.BaseBody

data class NewChatQuestionBody(
    override val em: String,
    override val pass: String,
    val text: String
) : BaseBody
