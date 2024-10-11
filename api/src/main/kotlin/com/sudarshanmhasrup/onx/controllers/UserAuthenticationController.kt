package com.sudarshanmhasrup.onx.controllers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import com.sudarshanmhasrup.onx.domains.dto.response.UserAccountCreationSuccessful
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.encodeToJsonElement
import org.json.JSONObject
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount(@RequestBody userDTO: UserDTO): JsonElement {

        val response = UserAccountCreationSuccessful(
            status = "Succeed!",
            statusCode = 200,
            response = "A new account is created successfully with username: @${userDTO.username}!",
            data = userDTO
        )

        val result = Json.encodeToJsonElement(response)

        return result
    }
}