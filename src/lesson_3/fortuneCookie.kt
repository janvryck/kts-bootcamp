package lesson_3

fun main() {
    val birthday = queryBirthday()
    println(getFortuneCookie(birthday))
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    return fortunes[birthday % fortunes.size]
}

fun queryBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}