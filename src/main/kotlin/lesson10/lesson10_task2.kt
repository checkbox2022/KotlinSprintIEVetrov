package lesson10

const val MIN_CONTENT_SYMBOL = 4

fun main() {
    print("Register a login: ")
    val login = readln()

    print("Register a password: ")
    val password = readln()

    validationUserData(login, password)
}

fun validationUserData(login: String, password: String) {
    if (login.length < MIN_CONTENT_SYMBOL || password.length < MIN_CONTENT_SYMBOL)
        println("Login and password are not long enough")
}