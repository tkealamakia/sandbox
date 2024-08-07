package com.tsunazumi.kotlin

open class MeetingTime(var time: String = "") {
  protected fun convertToString(time: Double) = String.format("%.02f", time)
}

class StartTime : MeetingTime() {
  infix fun at(theTime: Double) { time = convertToString(theTime) }
}

class EndTime : MeetingTime() {
  infix fun by(theTime: Double) { time = convertToString(theTime) }
}

class Meeting (val title: String) {
  val start = StartTime()
  val end = EndTime()

  override fun toString() = "$title Meeting starts at ${start.time}  and ends at ${end.time}"
}

infix fun String.meeting(block: Meeting.() -> Unit) {
  val meeting = Meeting(this)

  meeting.block()

  println(meeting)
}

fun main(args:Array<String>) {
  "Release Planning" meeting {
    start at 14.30
    end by 15.20
  }
}