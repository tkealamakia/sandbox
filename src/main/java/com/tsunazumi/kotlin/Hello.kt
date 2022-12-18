package com.tsunazumi.kotlin

import java.lang.RuntimeException


class Car(val yearOfMake: Int, theColor: String) {
  var fuelLevel = 100

  var color = theColor

  var name = "Datsun"
    set(value) {
      if (value.isBlank()) {
        throw RuntimeException("no empty please")
      }
      field = value
    }

}

fun main(args: Array<String>) {
  val car = Car(1979, "tan")
  println(car.fuelLevel)
  println(car.color)
  car.color = "Blue"
  println(car.color)
  println(car.name)
  car.name = "Toyota"
  println(car.name)

  val list = mutableListOf("Hello")
  println(list)



}


