package lesson4

fun main() {
    var isEven = false

    println("Hands: ${!isEven}\nLegs:  $isEven \nBack:  $isEven\nPress: ${!isEven}")

    isEven = !isEven
}