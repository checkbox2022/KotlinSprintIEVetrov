package lesson6

fun main() {
    print("Create a login: ")
    val userLogin = readln()
    print("Create a password: ")
    val userPassword = readln()

    do {
        println("Enter your login:")
        val login = readln()
        println("Enter your password:")
        val password = readln()
    } while (login != userLogin || password != userPassword)

    println("Authorization was successful!")


}