package com.sudarshanmhasrup.onx.controllers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import com.sudarshanmhasrup.onx.domains.dto.response.UserAccountCreationSuccessful
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount(@RequestBody userDTO: UserDTO): String {
        return Json.encodeToString(UserAccountCreationSuccessful(
            status = "Succeed!",
            statusCode = 200,
            response = "",
            data = userDTO
        ))
    }
}