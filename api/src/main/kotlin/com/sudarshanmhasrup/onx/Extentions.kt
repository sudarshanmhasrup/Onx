package com.sudarshanmhasrup.onx

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import com.sudarshanmhasrup.onx.domains.entities.UserEntity
import java.time.LocalDate

fun UserEntity.toUserDTO() = UserDTO(
    userId = this.userId,
    username = this.username,
    firstName = this.firstName,
    lastName = this.lastName,
    emailAddress = this.emailAddress,
    mobileNumber = this.mobileNumber,
    age = this.age,
    gender = this.gender,
    birthdate = this.birthdate.toString(),
    city = this.city,
    state = this.state,
    country = this.country,
    bio = this.bio,
    profilePicture = this.profilePicture
)

fun UserDTO.toUserEntity() = UserEntity(
    userId = this.userId,
    username = this.username,
    firstName = this.firstName,
    lastName = this.lastName,
    emailAddress = this.emailAddress,
    mobileNumber = this.mobileNumber,
    age = this.age,
    gender = this.gender,
    birthdate = LocalDate.parse(this.birthdate),
    city = this.city,
    state = this.state,
    country = this.country,
    bio = this.bio,
    profilePicture = this.profilePicture,
    accountCreationDate = LocalDate.now()
)