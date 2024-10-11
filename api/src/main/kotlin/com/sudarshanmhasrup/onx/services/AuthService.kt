package com.sudarshanmhasrup.onx.services

import com.sudarshanmhasrup.onx.domains.entities.UserEntity

interface AuthService {
    fun createNewAccount(userEntity: UserEntity): UserEntity
}