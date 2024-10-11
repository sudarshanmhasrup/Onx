package com.sudarshanmhasrup.onx.services.impl

import com.sudarshanmhasrup.onx.domains.entities.UserEntity
import com.sudarshanmhasrup.onx.repositories.UserRepository
import com.sudarshanmhasrup.onx.services.AuthService
import org.springframework.stereotype.Service

@Service
class AuthServiceImpl(private val userRepository: UserRepository) : AuthService {

    // Create a new user account
    override fun createNewAccount(userEntity: UserEntity): UserEntity {
        return userRepository.save(userEntity)
    }
}