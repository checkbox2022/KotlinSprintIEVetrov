package lesson15

fun main() {
    val user = User("Pavel")
    user.readMessage()
    user.typeMessage()

    val admin = Admin("Den")
    admin.readMessage()
    admin.deleteUser()
    admin.typeMessage()
    admin.deleteMessage()
}

abstract class Account(val name: String) {
    fun readMessage() {
        println("$name is reading the message")
    }

    fun typeMessage() {
        println("$name is typing the message")
    }
}

class User(name: String) : Account(name)

class Admin(name: String) : Account(name) {
    fun deleteUser() {
        println("Admin $name deleted this user")
    }

    fun deleteMessage() {
        println("Admin $name deleted this message")
    }
}




