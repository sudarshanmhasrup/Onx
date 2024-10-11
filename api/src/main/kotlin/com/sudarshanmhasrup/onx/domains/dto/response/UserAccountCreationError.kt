package com.sudarshanmhasrup.onx.domains.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class UserAccountCreationError(
    val statusCode: Int,
    val status: String,
    val response: String
)
