package lesson10

const val MIN_CONTENT_SYMBOL = 4

fun main() {
    print("Register a login: ")
    val login = readln()

    print("Register a password: ")
    val password = readln()

    val lengthDataChecker =
        if (getValidationUserData(login) && getValidationUserData(password)) "You are welcome!"
        else "The username or password is not long enough"

    println(lengthDataChecker)
}

fun getValidationUserData(data: String) = data.length >= MIN_CONTENT_SYMBOL

