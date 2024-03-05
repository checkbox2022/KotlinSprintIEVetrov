package lesson10

fun main() {
    val login = "Pavel"
    val password = "!q2w3e4r"

    println(shoppingCardReturner(authorization(login, password)))
}

fun shoppingCardReturner(token: String?) =
    if (token != null) listOf("T-short", "Jeans", "Hat").joinToString(", ") else "Failed authorization attempt!"

fun authorization(login: String, password: String) =
    if (login == "Pavel" && password == "!q2w3e4r") tokenGenerator() else null

fun tokenGenerator(): String? {
    val symbols = ('A'..'Z') + ('a'..'z') + (0..9)
    var token = ""

    for (i in 1..32) token += symbols.random().toString()

    return token
}


