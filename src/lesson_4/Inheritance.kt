package lesson_4

fun main() {
    val pleco = PezDiablo()
    println("devil fish with color ${pleco.color}")
    pleco.eat()
}

interface FishColor {
    val color: String
}

class PezDiablo(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

object GoldColor : FishColor {
    override val color = "gold"
}
object RedColor : FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println("eating $food")
    }
}