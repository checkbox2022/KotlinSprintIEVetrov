package lesson10

fun main() {
    print("Enter login: ")
    val login = readln()

    print("Enter password: ")
    val password = readln()

    val token = authorization(login, password)

    println(shoppingCardReturner(token))
}

fun shoppingCardReturner(token: String?) =
    if (token != null) listOf("T-short", "Jeans", "Hat").joinToString(", ") else "Failed authorization attempt!"

fun authorization(login: String, password: String): String? {
    val userLogin = "Pav"
    val userPassword = "123"
    return if (login == userLogin && password == userPassword) tokenGenerator() else null
}

fun tokenGenerator(): String? {
    val symbols = ('A'..'Z') + ('a'..'z') + (0..9)
    var token = ""

    for (i in 1..32) token += symbols.random().toString()

    return token
}


