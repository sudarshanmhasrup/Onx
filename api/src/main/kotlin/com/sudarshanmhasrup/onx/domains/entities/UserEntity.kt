package com.sudarshanmhasrup.onx.domains.entities

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "users")
data class UserEntity(

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
    @SequenceGenerator(
        name = "users_id_seq",
        sequenceName = "users_id_seq",
        allocationSize = 1
    )
    val id: Long? = null,

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "username")
    val username: String,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "email_address")
    val emailAddress: String,

    @Column(name = "mobile_number")
    val mobileNumber: String,

    @Column(name = "age")
    val age: Int,

    @Column(name = "gender")
    val gender: String,

    @Column(name = "date_of_birth")
    val birthdate: LocalDate,

    @Column(name = "city")
    val city: String,

    @Column(name = "state")
    val state: String,

    @Column(name = "country")
    val country: String,

    @Column(name = "bio")
    val bio: String,

    @Column(name = "profile_picture")
    val profilePicture: String,

    @Column(name = "date_of_account_creation")
    val accountCreationDate: LocalDate
)