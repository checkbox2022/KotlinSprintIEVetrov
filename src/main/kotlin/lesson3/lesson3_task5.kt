package lesson3

fun main() {
    val move = "D2-D4;0"
    val (pointOfEntry, pointOfEnd, moveCount) = move.split("-", ";")
    println(pointOfEntry)
    println(pointOfEnd)
    println(moveCount)

}