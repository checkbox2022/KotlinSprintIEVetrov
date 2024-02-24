package lesson4

fun main() {
    val trainingDay = 5
    var isHands = false
    var isLegs = false
    var isBack = false
    var isPress = false
    val group = if (trainingDay % 2 != 0) {
        isHands = true;isPress = true
    } else {
        isLegs = true;isBack = true
    }
    println("Hands: $isHands\nLegs:  $isLegs\nBack:  $isBack\nPress: $isPress")
}