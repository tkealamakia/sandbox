package com.tsunazumi.dsa.hackerrank

fun main(arg: Array<String>) {
  val arr = arrayOf(5,4,4,2,2,8)
  var result = ArrayList<Int>()
  val finalresult = cutTheSticks(arr, result)
  finalresult.forEach { println(it) }
}

fun cutTheSticks(arr: Array<Int>, result: ArrayList<Int>): Array<Int> {
  if (arr.isEmpty()) {
    return result.toTypedArray();
  }
  var input = arr.toList()
  // find the smallest number
  val smallest = input.sorted()[0]

  // cut that amount from each item in the list
  var newArr = ArrayList<Int>()
  for (i in arr) {
    if ( i - smallest > 0) {
      newArr.add(i - smallest)
    }
  }
  result.add(arr.size)

  return cutTheSticks(newArr.toTypedArray(), result)

}