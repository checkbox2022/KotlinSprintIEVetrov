package lesson3
const val GREETING_MORNING = "Good morning"
const val GREETING_EVENING = "Good evening"

fun main() {
    val name = "Pavel"

    var greeting = "$GREETING_MORNING, $name!"
    println(greeting)

    greeting = "$GREETING_EVENING, $name!"
    println(greeting)
}