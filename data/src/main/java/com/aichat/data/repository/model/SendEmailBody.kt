package com.aichat.data.repository.model

import com.aichat.base.base.BaseBody


data class SendEmailBody(
    override val em: String,
    override val pass: String
) : BaseBody
