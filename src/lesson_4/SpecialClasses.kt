package lesson_4

object MobyDickWhale {
    val author = "Herman Melville"
}

enum class Color(val rgb: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun whatSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "I am the walrus"
        is SeaLion -> "Sea lion"
        // No else required, since no other types of seal can exist:
        //   All implementations must live inside this file since Seal is a 'sealed' class
    }
}
