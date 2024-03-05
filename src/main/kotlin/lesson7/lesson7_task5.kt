package lesson7

const val UNIQUE_THREE_FIRST_SYMBOLS = 3
const val MIN_PASSWORD_LENGTH = 6

fun main() {
    var password = ""
    val passwordContent = listOf(('A'..'Z'), ('a'..'z'), ('0'..'9'))
    var passwordLength: Int
    println("Minimum password length is 6")

    do {
        print("Enter password length: ")
        passwordLength = readln().toInt()
    } while (passwordLength < MIN_PASSWORD_LENGTH)

    password += passwordContent.map { it.random() }.joinToString("")

    for (i in UNIQUE_THREE_FIRST_SYMBOLS until passwordLength)
        password += (passwordContent[(0..2).random()].random())

    password = password.toList().shuffled().joinToString("")

    println(password)
}
