package lesson_3

fun main(args: Array<String>) {
    println("Good ${when (args[0].toInt()) {
        in 0..11 -> { "morning" }
        in 12..23 -> { "night" }
        else -> "day"
    }}, Kotlin")
}