package com.github.sudarshanmhasrup

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OnxApplication

fun main(arguments: Array<String>) {
    runApplication<OnxApplication>(*arguments)
}