package lesson_4

class SimpleSpice {

    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Number
        get() = if (spiciness == "mild") 5 else 0

}

fun main() {
    val spice = SimpleSpice()
    println("${spice.name} heat level: ${spice.heat}")
}