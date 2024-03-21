package lesson21

fun main() {

    val str = "Hello"
    println(str.vowelCount())

}

fun String.vowelCount(): Int {

    var count = 0

    subSequence(0, length).forEach {
        if (it in "AaEeIiOoUu") count++
    }

    return count

}