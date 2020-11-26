fun main() {
    println(canAddFish(10.0, listOf(3,3,3))) // ---> false
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false)) // ---> true
    println(canAddFish(9.0, listOf(1,1,3), 3)) // ---> false
    println(canAddFish(10.0, listOf(), 7, true)) // ---> true
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return currentFish.sum().plus(fishSize) <=  tankSize.times(if(hasDecorations) 0.8 else 1.0)
}