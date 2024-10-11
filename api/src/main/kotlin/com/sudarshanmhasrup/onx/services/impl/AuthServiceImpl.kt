package com.sudarshanmhasrup.onx.services.impl

import com.sudarshanmhasrup.onx.domains.entities.UserEntity
import com.sudarshanmhasrup.onx.repositories.UserRepository
import com.sudarshanmhasrup.onx.services.AuthService

class AuthServiceImpl(private val userRepository: UserRepository) : AuthService {

    // Create a new user account
    override fun createNewAccount(userEntity: UserEntity): UserEntity {
        userRepository.save(userEntity)
        return userEntity
    }
}