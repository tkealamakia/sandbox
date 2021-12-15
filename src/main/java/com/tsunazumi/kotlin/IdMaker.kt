package com.tsunazumi.kotlin

import java.io.File

fun main(args: Array<String>) {

  var count = 0
  var str = ""
  File("multiple-productIds.txt").forEachLine {
    str = str + "," + it
    if (count % 100 == 0) {
      println(str.substring(1, str.length))
      str = ""
    }
    count++
  }
}
