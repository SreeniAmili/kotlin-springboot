package com.tech.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class EmployeeServiceApplication

fun main(args: Array<String>) {
    runApplication<EmployeeServiceApplication>()
}
