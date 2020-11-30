import java.util.*

{ println("Lambda") }()
val swim = { println("Swimming...") }
val clean = { dirtiness: Int -> dirtiness/2 }

swim()
println(clean(20))

val rollDice = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}
println(rollDice(0))
println(rollDice(10))

val gamePlay = { rollOfTheDice: Int -> println(rollOfTheDice)}
gamePlay(rollDice(6))
gamePlay(rollDice(6))
gamePlay(rollDice(6))