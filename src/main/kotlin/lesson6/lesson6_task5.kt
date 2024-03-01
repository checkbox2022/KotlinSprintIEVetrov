package lesson6

const val MIN_DIGIT = 1
const val MAX_DIGIT = 9
const val ATTEMPTS = 3
const val LAST_ATTEMPT = 1

fun main() {
    print("Create a login: ")
    val userLogin = readln()
    print("Create a password: ")
    val userPassword = readln()

    do {
        println("\nEnter your login:")
        val login = readln()
        println("Enter your password:")
        val password = readln()
    } while (login != userLogin || password != userPassword)

    var countAttempts = ATTEMPTS

    do {
        val firstNumber = (MIN_DIGIT..MAX_DIGIT).random()
        val secondNumber = (MIN_DIGIT..MAX_DIGIT).random()
        val sumFirstAndSecond = firstNumber + secondNumber

        print("\nAdd two numbers: $firstNumber + $secondNumber = ")
        val result = readln().toInt()

        if (result == sumFirstAndSecond) {
            println("\nAuthorization was successful!")
            break
        }
    } while (countAttempts-- > LAST_ATTEMPT)

    if (countAttempts == 0) println("Access is closed!")

}