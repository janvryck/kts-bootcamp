package lesson_4.spices

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    val heat: Number
        get() = when (spiciness) {
            "none" -> 0
            "mild" -> 5
            "hot" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
        Spice(name, spiciness, color),
        Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding $name curry for $spiciness spiciness")
    }
}

data class SpiceContainer(var spice: Spice) {
    val label = "${spice.name} jar"
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xffff00)
}

fun main() {
    val curry = Curry("MyCurry", "mild")
    curry.grind()
    println("Curry has color ${curry.color}")
    val curryContainer = SpiceContainer(curry)
    println("Put curry in the ${curryContainer.label}")
}