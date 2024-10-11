package com.sudarshanmhasrup.onx.controllers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import com.sudarshanmhasrup.onx.domains.dto.response.UserAccountCreationError
import com.sudarshanmhasrup.onx.domains.dto.response.UserAccountCreationSuccessful
import com.sudarshanmhasrup.onx.handlers.validateUserDTO
import com.sudarshanmhasrup.onx.services.AuthService
import com.sudarshanmhasrup.onx.toUserDTO
import com.sudarshanmhasrup.onx.toUserEntity
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.encodeToJsonElement
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController(
    private val authService: AuthService
) {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount(@RequestBody userDTO: UserDTO): JsonElement {

        val(validInformation, message) = validateUserDTO(userDTO)

        if (!validInformation) {
            val jsonObject = Json.encodeToJsonElement(UserAccountCreationError(
                statusCode = 400,
                status = "Failed",
                response = message
            ))
            return jsonObject
        } else {
            val jsonObject = Json.encodeToJsonElement(UserAccountCreationSuccessful(
                status = "Succeed!",
                statusCode = 200,
                response = "A new account is created successfully with username: @${userDTO.username}!",
                data = userDTO
            ))
            authService.createNewAccount(userDTO.toUserEntity()).toUserDTO()
            return jsonObject
        }
    }
}