package com.sudarshanmhasrup.onx.repositories

import com.sudarshanmhasrup.onx.domains.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long?>