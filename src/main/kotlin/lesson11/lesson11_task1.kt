package lesson11

fun main() {
    val user1 = User(12345, "Pavel", "54321", "pashka@yandex.ru")
    println(
        "UserID: ${user1.id}\n" +
                "Login: ${user1.login}\n" +
                "Password: ${user1.password}\n" +
                "Email: ${user1.email}\n"
    )

    val user2 = User(5678, "Anna", "qwerty", "anny@yandex.ru")
    println(
        "UserID: ${user2.id}\n" +
                "Login: ${user2.login}\n" +
                "Password: ${user2.password}\n" +
                "Email: ${user2.email}"
    )
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)