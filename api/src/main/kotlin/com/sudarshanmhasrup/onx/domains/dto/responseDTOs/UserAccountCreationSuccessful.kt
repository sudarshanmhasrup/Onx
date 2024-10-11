package com.sudarshanmhasrup.onx.domains.dto.responseDTOs

import com.sudarshanmhasrup.onx.domains.dto.requestDTOs.UserDTO
import org.apache.catalina.User

data class UserAccountCreationSuccessful(
    val statusCode: Int,
    val status: String,
    val response: String,
    val data: UserDTO
)
