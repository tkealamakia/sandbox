package com.tsunazumi.dsa.freecodecamp

fun main(args: Array<String>) {
  val memo = mutableMapOf<Long, Long>()
  val fib = fib(8, memo)
  println(fib)

}

fun fib(num: Long, memo:MutableMap<Long, Long>): Long {
  if (memo.containsKey(num)) { return memo[num]!! }
  if (num <= 2) { return 1 }
  memo[num] = fib(num - 1, memo) + fib(num - 2, memo)
  return memo[num]!!
}