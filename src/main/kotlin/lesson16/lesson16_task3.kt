package lesson16

fun main() {
    val user = User("Pavel", "1q2w")

    user.validatePassword("123").also { println(it) }
}

class User(val name: String, private val password: String) {
    fun validatePassword(string: String) = string == password
}