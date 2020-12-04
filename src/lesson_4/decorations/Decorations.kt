package lesson_4.decorations

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1 == d2)
    println(d2 == d3)

    val d4 = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decorations2("crystal", "wood", "diver")
    println(d5)
    val (rock, wood, diver) = d5
    println("\t$rock")
    println("\t$wood")
    println("\t$diver")
}

data class Decorations(val rocks: String)
data class Decorations2(val rocks: String, val wood: String, val diver: String)