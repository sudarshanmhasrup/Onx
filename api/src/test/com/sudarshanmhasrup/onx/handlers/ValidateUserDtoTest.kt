package com.sudarshanmhasrup.onx.handlers

import com.sudarshanmhasrup.onx.domains.dto.request.UserDTO
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidateUserDtoTest {

    @Test
    fun testValidateUserDTO() {

        val user = UserDTO(
            userId = "",
            username = "john_doe",
            firstName = "John",
            emailAddress = "",
            age = 25,
            gender = "",
            birthdate = "",
            city = "New York",
            state = "",
            country = "USA"
        )

        val expectedResult = Pair(false, "userId, emailAddress, gender, birthdate, state cannot be empty!")
        val actualResult = validateUserDTO(user)

        assertEquals(expectedResult, actualResult)
    }
}