package com.sudarshanmhasrup.onx.domains.dto

import java.sql.Date

data class UserDTO(
    val userId: String,
    val username: String,
    val firstName: String,
    val lastName: String = "",
    val emailAddress: String = "",
    val mobileNumber: String = "",
    val age: Int,
    val gender: String,
    val birthdate: Date,
    val city: String,
    val state: String,
    val country: String,
    val bio: String,
    val profilePicture: String,
    val accountCreationDate: Date
)