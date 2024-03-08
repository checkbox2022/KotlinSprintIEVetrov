package lesson10

fun main() {
    val computerMove = rollTheDice1()
    println("The computer made its move and threw away the dice: $computerMove")

    val userMove = rollTheDice1()
    println("The user made its move and threw away the dice: $userMove")

    val result = if (computerMove > userMove) "Computer WIN!"
    else if (computerMove < userMove) "User WIN!"
    else "Draw!"

    println(result)
}

fun rollTheDice1() = (1..6).random()