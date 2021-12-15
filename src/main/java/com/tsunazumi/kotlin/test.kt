package com.tsunazumi.kotlin


fun main(args: Array<String>) {

  val length = 100
  val printIt: String.(Int) -> Unit = {
    println("n is $it, length is $length")
  }

  "Foobar1".printIt(6)

  val optionIds = listOf("product", "inventory", "price")
  val sniperTypes = optionIds.joinToString { it -> "\"${it}\"" }
  val jsonBody = """
      {
        "types": [$sniperTypes],
        "productIds": [23423432],
        "optionIds": []
      }""".trimIndent()


  println(jsonBody)
  val optionIdsString = optionIds.joinToString (",") { it }
  println(optionIdsString)

  TestListener().received("consumer param", "message param")
  TestListener().received2("way", "easier")
  println("Foobar".lastChar)

  fun sayHello() = { println("Hello") }
  sayHello()()

}

val String.lastChar
  get() = get(length - 1)

class TestListener( ) {
  fun received2(messag1: String, messag2: String) = println(messag1)

    fun received(message1: String, message2: String) = delegate(message1, message2)

    private val delegate: (String, String) -> Unit = listener { param ->
      for (i in 1..3) {
        println(param)
      }
    }

}

fun listener( block: (String) -> Unit ): (String, String) -> Unit =
{ message2, message3 ->
  block(message2)
}


