package com.sudarshanmhasrup.onx.domains.dto.response

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import kotlinx.serialization.Serializable

@Serializable
data class UserAccountCreationSuccessful(
    val statusCode: Int,
    val status: String,
    val response: String,
    val data: UserDTO
)
