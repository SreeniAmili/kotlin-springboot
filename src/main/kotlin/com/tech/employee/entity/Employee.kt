package com.tech.employee.entity

import jakarta.persistence.*

@Entity
data class Employee(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    val department: String = "",
    val salary: Double = 0.0
)
