package lesson_4

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    printAquarium(myAquarium)

    myAquarium.height = 80
    printAquarium(myAquarium)

    myAquarium.volume = 400
    printAquarium(myAquarium)

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    printAquarium(smallAquarium)

    val aquariumForFish = Aquarium(9)
    printAquarium(aquariumForFish)
}

fun printAquarium(aquarium: Aquarium) {
    println("Aquarium:\n" +
            "\tLxBxH\t${aquarium.length}cm x ${aquarium.width}cm x ${aquarium.height}cm\n" +
            "\tVolume\t${aquarium.volume}l")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    println("\nFISH")

    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
    feedFish(shark)
    feedFish(pleco)
}