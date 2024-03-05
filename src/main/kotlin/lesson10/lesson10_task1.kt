package lesson10

fun main() {
    val computerMove = diceShuffler()
    println("The computer made its move and threw away the dice: $computerMove")

    val userMove = diceShuffler()
    println("The user made its move and threw away the dice: $userMove")

    val result = if (computerMove > userMove) "Computer WIN!"
    else if (computerMove < userMove) "User WIN!"
    else "Draw!"

    println(result)
}

fun diceShuffler() = (1..6).random()