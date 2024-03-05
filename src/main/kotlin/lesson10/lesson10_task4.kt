package lesson10

import java.util.*

fun main() {
    var countGames = 0

    do {
        countGames++
        diceMover()
        println("\nDo you want to play it again? ")
        val answer = readln().lowercase(Locale.getDefault())
    } while (answer == "yes")

    println("You have played $countGames games")
}

fun diceShufflerNew() = (1..6).random()
fun diceMover() {
    val computerMove = diceShufflerNew()
    println("The computer made its move and threw away the dice: $computerMove")

    val userMove = diceShufflerNew()
    println("The user made its move and threw away the dice: $userMove")

    val result = if (computerMove > userMove) "Computer WIN!"
    else if (computerMove < userMove) "User WIN!"
    else "Draw!"

    println(result)
}