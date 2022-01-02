package com.tsunazumi.kotlin

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'beautifulDays' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER i
 *  2. INTEGER j
 *  3. INTEGER k
 */

fun beautifulDays(i: Int, j: Int, k: Int): Int {
  //iterate the range from i to j
  var count = 0
  for (n in i..j) {
    val reversed = Integer.parseInt(n.toString().reversed())
    val diff = Math.abs(n - reversed)
    if (diff % k == 0) {
      count++;
    }
  }
  return count
}


  fun main(args: Array<String>) {

  val i = 20

  val j = 23

  val k = 6

  val result = beautifulDays(i, j, k)

  println(result)
}
