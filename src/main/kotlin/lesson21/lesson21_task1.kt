package lesson21

fun main() {

    val str = "Hello"

    println(str.vowelCount())

}

fun String.vowelCount() = count { it in "AaEeIiOoUu" }
