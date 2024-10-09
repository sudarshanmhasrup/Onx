package com.github.sudarshanmhasrup

import com.github.sudarshanmhasrup.domain.dto.UserDTO
import com.github.sudarshanmhasrup.domain.entities.UserEntity

fun UserEntity.toUserDTO() = UserDTO(
    id = this.id,
    username = this.username,
    firstName = this.firstName,
    lastName = this.lastName,
    emailAddress = this.emailAddress,
    mobileNumber = this.mobileNumber
)