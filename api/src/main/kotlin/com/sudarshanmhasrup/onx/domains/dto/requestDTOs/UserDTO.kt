package com.sudarshanmhasrup.onx.domains.dto.requestDTOs

data class UserDTO(
    val userId: String = "",
    val username: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val emailAddress: String = "",
    val mobileNumber: String = "",
    val age: Int = 0,
    val gender: String = "",
    val birthdate: String = "",
    val city: String = "",
    val state: String = "",
    val country: String = "",
    val bio: String = "",
    val profilePicture: String = "",
    val accountCreationDate: String = ""
)