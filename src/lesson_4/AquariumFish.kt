package lesson_4

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color: String  ="gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color: String  ="gold"
    override fun eat() {
        println("Munch on some algae")
    }
}

interface FishAction {
    fun eat()
}