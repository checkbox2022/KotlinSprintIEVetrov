package lesson17

fun main() {
    val user1 = User("Dmitriy", "1q2w3e4")
    user1.login = "Pavel"
    println(user1.login)
    user1.password = "12345"
    println(user1.password)
}

class User(_userLogin: String, _userPassword: String) {
    var login = _userLogin
        set(newLogin) {
            field = newLogin
            println("Login successfully changed")
        }

    var password = _userPassword
        get() = ("*").repeat(field.length)
        set(value) = println("You can't change your password")
}