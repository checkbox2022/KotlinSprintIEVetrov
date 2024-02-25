package lesson5

fun main() {
    val firstNumber = 15
    val secondNumber = 33

    println("Enter two random numbers from 0 to 42.\nEnter first number:")
    val firstEnter = readln().toInt()
    println("Enter second number:")
    val secondEnter = readln().toInt()

    if ((firstEnter == firstNumber || firstEnter == secondNumber) && (secondEnter == firstNumber || secondEnter == secondNumber))
        println("You won main prize! Gratz!")
    else if ((firstEnter == firstNumber || firstEnter == secondNumber) || (secondEnter == firstNumber || secondEnter == secondNumber))
        println("You won a consolation prize")
    else println("Failure")

    println("\nThe random numbers were: $firstNumber and $secondNumber")
}