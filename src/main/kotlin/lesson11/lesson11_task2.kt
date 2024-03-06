package lesson11

fun main() {
    val user = User2(999, "Pavel", "123", "pashka@yandex.ru")
    user.toChangeBio()
    user.toChangePassword()
    user.toDisplayUserInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
) {
    var bio = ""

    fun toDisplayUserInfo() {
        println("\nid: $id\nlogin: $login\npassword: $password\nemail: $email\nbio: $bio")
    }

    fun toChangeBio() {
        println("Fill out your biography:")
        bio = readln()
    }

    fun toChangePassword() {
        print("Enter your password: ")
        val passwordChecker = readln()
        if (password == passwordChecker) {
            print("Change the password: ")
            password = readln()

            println("Password has been changed!")
        }
    }
}