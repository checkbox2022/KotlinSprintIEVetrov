package lesson22

fun main() {

    val user = User("Pavel", 12345, 36)

    val (name, id, age) = user

    println("User name is $name. User ID is $id and age $age")

}

data class User(val name: String, val id: Int, val age: Int)