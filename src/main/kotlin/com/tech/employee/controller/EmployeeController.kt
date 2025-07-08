package com.tech.employee.controller

import com.tech.employee.entity.Employee
import com.tech.employee.repository.EmployeeRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeeController(private val repository: EmployeeRepository) {

    @GetMapping
    fun getAll(): List<Employee> = repository.findAll()

    @PostMapping
    fun add(@RequestBody employee: Employee): Employee = repository.save(employee)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Employee =
        repository.findById(id).orElseThrow { RuntimeException("Employee not found") }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = repository.deleteById(id)
}
