package lesson3

fun main() {
    val name = "Pavel"
    val greetingsMorning = "Good morning"
    val greetingsEverning = "Good everning"
    var greeting = "$greetingsMorning, $name"
    println(greeting)
    greeting = "$greetingsEverning, $name"
    println(greeting)
}