package lesson4

fun main() {
    val trainingDay = 5
    var isEven = false

    if (trainingDay%2==0) isEven = true

    println("Hands: ${!isEven}\nLegs:  $isEven \nBack:  $isEven\nPress: ${!isEven}")
}