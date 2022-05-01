package com.tsunazumi.kotlin

abstract class Printer(val modelName: String) {
  open fun printModel() = println("The model name of this printer is $modelName")
  abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
  override fun printModel() = println("The model name of this laster printer is $modelName")
  override fun bestSellingPrice(): Double = 129.99
}

open class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 5) {

}

fun main(args:Array<String>) {
  val laserPrinter = LaserPrinter("HP", 4)
  laserPrinter.printModel()

  SomethingElse("whatever")
}

open class Something: MySubInterface {
  val someProperty: String
  override val number: Int = 25

  constructor(someParameter: String) {
    someProperty = someParameter
    println("I'm in the parent's constructor")
  }

  override fun mySubFunction(num: Int): String {
    TODO("Not yet implemented")
  }

  override fun myFunction(str: String): String {
    TODO("Not yet implemented")
  }
}

class SomethingElse: Something {
  constructor(someOtherParameter: String): super(someOtherParameter) {
    println("I'm in the child's constructor")
  }
}

interface MyInterface {
  val number: Int
  val number2: Int
    get() = number * 100

  fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
  fun mySubFunction(num: Int): String
}

