package lesson_3

import java.time.LocalDate

fun main() {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    println(LocalDate.now().dayOfWeek.name)
}