package com.sudarshanmhasrup.onx.controllers

import com.sudarshanmhasrup.onx.domains.dto.CreateNewAccountResponseDTO
import com.sudarshanmhasrup.onx.domains.dto.UserDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAuthenticationController {

    @PostMapping("/v1/auth/create-new-account")
    fun createNewAccount(@RequestBody userDTO: UserDTO): CreateNewAccountResponseDTO {
        return CreateNewAccountResponseDTO(
            statusCode = 200,
            status = "Succeed!",
            message = "New account created successfully with username: @${userDTO.username}!"
        )
    }
}