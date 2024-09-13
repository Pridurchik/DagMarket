package com.aichat.data.repository.model

import com.aichat.base.base.BaseBody

data class Body(
    override val em: String,
    override val pass: String
) : BaseBody
