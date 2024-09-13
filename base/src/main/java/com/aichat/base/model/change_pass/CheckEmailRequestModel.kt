package org.ailynx.base.model.change_pass

data class CheckEmailRequestModel(
    val reset_check: String? = null,
    val msg: String? = null,
    val user_id: Int? = null,
    val code: Int? = null
)
