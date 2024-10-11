package com.sudarshanmhasrup.onx.controllers

import com.sudarshanmhasrup.onx.domains.dto.UserDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount(@RequestBody userDTO: UserDTO): UserDTO {
        return userDTO
    }
}