package lesson_4

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    printAquarium(myAquarium)

    myAquarium.height = 80
    printAquarium(myAquarium)

    myAquarium.volume = 400
    printAquarium(myAquarium)
}

fun printAquarium(aquarium: Aquarium) {
    println("length\t${aquarium.length}cm\n" +
            "width\t${aquarium.width}cm\n" +
            "height\t${aquarium.height}cm\n" +
            "volume\t${aquarium.volume}l\n")
}