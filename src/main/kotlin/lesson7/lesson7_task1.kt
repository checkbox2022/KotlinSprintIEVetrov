package lesson7

const val PASSWORD_SIZE = 6
const val MIN_DIGIT_IN_PASSWORD = 0
const val MAX_DIGIT_IN_PASSWORD = 9

fun main() {
    var password = ""
    var odd = true

    for (i in 1..PASSWORD_SIZE) {
        if (odd) password += ('a'..'z').random()
        else password += (MIN_DIGIT_IN_PASSWORD..MAX_DIGIT_IN_PASSWORD).random()
        odd = !odd
    }

    println(password)
}