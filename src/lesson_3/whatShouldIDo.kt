package lesson_3

fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("happy", temperature = 35))
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    fun isOutdoorWeather(mood: String, weather: String) = mood == "happy" && weather == "sunny"
    return when {
        isOutdoorWeather(mood, weather) ->
            if (temperature > 30) "go sunbathing" else "go for a walk"
        mood == "sad" && weather == "rainy" -> "read a book"
        else -> "twiddle your thumbs"
    }
}
