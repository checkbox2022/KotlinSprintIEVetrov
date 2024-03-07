package lesson10

fun main() {
    val computerMove = rollTheDice()
    println("The computer made its move and threw away the dice: $computerMove")

    val userMove = rollTheDice()
    println("The user made its move and threw away the dice: $userMove")

    val result = if (computerMove > userMove) "Computer WIN!"
    else if (computerMove < userMove) "User WIN!"
    else "Draw!"

    println(result)
}

fun rollTheDice() = (1..6).random()