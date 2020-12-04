package lesson_4

class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Number
        get() = when (spiciness) {
            "none" -> 0
            "mild" -> 5
            "hot" -> 10
            else -> 0
        }

    init {
        println("Spice '$name'\t head $heat")
    }
}

fun makeSalt(): Spice {
    return Spice("salt", "none")
}

fun main() {
    listOf(Spice("curry"), Spice("pepper", "hot"), makeSalt())
}