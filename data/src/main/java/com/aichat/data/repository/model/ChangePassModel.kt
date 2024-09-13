package com.aichat.data.rerepository.model

data class ChangePassModel(
    val reset_change: String,
    val msg: String,
    val user_id: Int,
    val code: Int
)
