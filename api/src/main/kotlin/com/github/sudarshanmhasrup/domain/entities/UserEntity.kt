package com.github.sudarshanmhasrup.domain.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class UserEntity(

    @Id
    val id: Long,

    @Column(name = "username")
    val username: String,

    @Column(name = "firstName")
    val firstName: String,

    @Column(name = "lastName")
    val lastName: String,

    @Column(name = "email_address")
    val emailAddress: String,

    @Column(name = "mobile_number")
    val mobileNumber: String,
)