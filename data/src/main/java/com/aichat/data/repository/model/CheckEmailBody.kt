package com.aichat.data.rerepository.model

import com.aichat.base.base.BaseBody

data class CheckEmailBody(
    override val em: String,
    override val pass: String,
    val code: Int
) : BaseBody