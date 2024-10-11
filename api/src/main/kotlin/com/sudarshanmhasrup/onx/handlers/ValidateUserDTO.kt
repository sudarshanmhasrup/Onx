package com.sudarshanmhasrup.onx.handlers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO

fun validateUserDTO(userDTO: UserDTO): Pair<Boolean, String> {

    val missingFieldsList = mutableListOf<String>()

    when {
        userDTO.userId.isBlank() -> missingFieldsList.add("userId")
        userDTO.username.isBlank() -> missingFieldsList.add("username")
        userDTO.firstName.isBlank() -> missingFieldsList.add("firstName")
        userDTO.emailAddress.isBlank() -> missingFieldsList.add("emailAddress")
        userDTO.age <= 0 -> missingFieldsList.add("age")
        userDTO.gender.isBlank() -> missingFieldsList.add("gender")
        userDTO.birthdate.isBlank() -> missingFieldsList.add("birthdate")
        userDTO.city.isBlank() -> missingFieldsList.add("city")
        userDTO.state.isBlank() -> missingFieldsList.add("state")
        userDTO.country.isBlank() -> missingFieldsList.add("country")
        else -> return Pair(true, "Information is valid!")
    }

    return Pair(false, "${missingFieldsList.joinToString( separator = ",")} cannot be empty!")
}