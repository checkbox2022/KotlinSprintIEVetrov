package lesson10

fun main() {
    print("Enter login: ")
    val login = readln()

    print("Enter password: ")
    val password = readln()

    val token = verifyAndGetToken(login, password)

    val out =
        when (val shoppingCard = returnShoppingCard(token)) {
            null -> "Failed authorization attempt"
            else -> shoppingCard.joinToString(", ")
        }

    println(out)
}

fun returnShoppingCard(token: String?): List<String>? {
    val shoppingCard = listOf("T-short", "Jeans", "Hat")

    return if (token != null) shoppingCard else null
}


fun verifyAndGetToken(login: String, password: String): String? {
    val userLogin = "Pav"
    val userPassword = "123"
    return if (login == userLogin && password == userPassword) generateToken() else null
}

fun generateToken(): String {
    val symbols = ('A'..'Z') + ('a'..'z') + (0..9)
    var token = ""

    for (i in 1..32) token += symbols.random().toString()

    return token
}


