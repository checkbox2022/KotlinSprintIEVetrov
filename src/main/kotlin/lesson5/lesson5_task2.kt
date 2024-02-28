package lesson5

const val MAJORITY = 18
const val YEAR = 2024

fun main() {
    val userYearOfBirth = readln().toInt()

    val userAge = YEAR - userYearOfBirth
    val isUserAgeMajority = userAge >= MAJORITY
    val adultContentAccess =
        if (isUserAgeMajority) "Access to hidden content is opened!"
        else "Access to hidden content is closed!"

    println(adultContentAccess)
}