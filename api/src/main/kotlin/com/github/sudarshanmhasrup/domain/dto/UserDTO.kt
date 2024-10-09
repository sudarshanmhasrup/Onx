package com.github.sudarshanmhasrup.domain.dto

import jakarta.persistence.Column
import jakarta.persistence.Id

data class UserDTO(
    val id: Long,
    val username: String,
    val firstName: String,
    val lastName: String,
    val emailAddress: String,
    val mobileNumber: String,
)
