package com.tsunazumi.kotlin

fun main(args: Array<String>) {
    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)
            )
    println(employees.minByOrNull (Employee::startYear))
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)