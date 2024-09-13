package org.ailynx.base.model.change_pass

data class ChangePassAnswerModel(
    val reset_change: String,
    val msg: String,
    val user_id: Int,
    val code: Int
)