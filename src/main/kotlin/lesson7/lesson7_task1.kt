package lesson7

const val PASSWORD_SIZE = 6

fun main() {
    var password = ""
    val charRange = 'a'..'z'
    val digitRange = 0..9

    for (i in 1..PASSWORD_SIZE) {
        if (i % 2 != 0) password += (charRange).random()
        else password += (digitRange).random()
    }

    println(password)
}