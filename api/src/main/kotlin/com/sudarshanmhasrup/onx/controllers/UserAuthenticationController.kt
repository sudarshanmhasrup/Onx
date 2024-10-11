package com.sudarshanmhasrup.onx.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount() {

    }
}