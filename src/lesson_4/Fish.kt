package lesson_4

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    constructor(): this(true, 9) {
        println("Secondary constructor")
    }

    init {
        size = if (friendly) volumeNeeded else volumeNeeded*2
    }

    init {
        println("Constructed ${if(!friendly) "un" else ""}friendly fish of size $size")
    }
}

fun main() {
    Fish()
}
