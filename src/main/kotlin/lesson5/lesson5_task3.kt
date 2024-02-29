package lesson5

const val FIRST_NUMBER = 15
const val SECOND_NUMBER = 33

fun main() {
    println("Enter two random numbers from 0 to 42.\nEnter first number:")
    val firstEnter = readln().toInt()
    println("Enter second number:")
    val secondEnter = readln().toInt()

    if ((firstEnter == FIRST_NUMBER && secondEnter == SECOND_NUMBER) || (firstEnter == SECOND_NUMBER && secondEnter == FIRST_NUMBER))
        println("You won main prize! Gratz!")
    else if ((firstEnter == FIRST_NUMBER || firstEnter == SECOND_NUMBER) || (secondEnter == FIRST_NUMBER || secondEnter == SECOND_NUMBER))
        println("You won a consolation prize")
    else println("Failure")

    println("\nThe numbers conceived by the program were: $FIRST_NUMBER and $SECOND_NUMBER")
}