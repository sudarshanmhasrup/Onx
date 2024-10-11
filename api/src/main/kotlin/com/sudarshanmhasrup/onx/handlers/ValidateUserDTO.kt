package com.sudarshanmhasrup.onx.handlers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO

fun validateUserDTO(userDTO: UserDTO): Pair<Boolean, String> {

    val missingFieldsList = mutableListOf<String>()

    if (userDTO.userId.isBlank()) missingFieldsList.add("userId")
    if (userDTO.username.isBlank()) missingFieldsList.add("username")
    if (userDTO.firstName.isBlank()) missingFieldsList.add("firstName")
    if (userDTO.emailAddress.isBlank()) missingFieldsList.add("emailAddress")
    if (userDTO.age <= 0) missingFieldsList.add("age")
    if (userDTO.gender.isBlank()) missingFieldsList.add("gender")
    if (userDTO.birthdate.isBlank()) missingFieldsList.add("birthdate")
    if (userDTO.city.isBlank()) missingFieldsList.add("city")
    if (userDTO.state.isBlank()) missingFieldsList.add("state")
    if (userDTO.country.isBlank()) missingFieldsList.add("country")

    return if (missingFieldsList.isEmpty()) {
        Pair(true, "Information is valid!")
    } else {
        Pair(false, "${missingFieldsList.joinToString( separator = ", ")} cannot be empty!")
    }
}