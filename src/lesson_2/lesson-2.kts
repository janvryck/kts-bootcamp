import kotlin.math.roundToInt

/*
 Basic Operations
 */
val noOfFish = 2.plus(71).plus(233).minus(13)
println("# of fish: $noOfFish")

val noOfAquariums = noOfFish.div(30.0).roundToInt()
println("# of aquariums: $noOfAquariums")

/*
 Variables
 */
var rainbowColor = "red"
rainbowColor = "blue"
val blackColor = "black"
// blackColor = "white" => error: val cannot be reassigned

/*
 Nullability
 */
var greenColor: Int? = null

/* -> Lists */
var listOfNull: List<Int?> = listOf(null, null)
var nullList: List<Int>? = null

/* -> Null checks */
var nullTest: Int? = null
println("null check: ${nullTest?.inc() ?: 0}")