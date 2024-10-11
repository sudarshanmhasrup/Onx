package com.sudarshanmhasrup.onx.services

import com.sudarshanmhasrup.onx.domains.entities.UserEntity
import org.springframework.stereotype.Service

@Service
interface AuthService {
    fun createNewAccount(userEntity: UserEntity): UserEntity
}