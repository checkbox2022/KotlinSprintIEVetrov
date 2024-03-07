package lesson10

fun main() {
    var manWinsCounter = 0

    do {
        when (launchNewRound()) {
            1 -> {
                manWinsCounter++
                println("Man win!")
            }

            0 -> println("Draw!")
            else -> println("Computer win!")
        }
        println("\nDo you want to play it again? ")
        val answer = readln().equals("yes", ignoreCase = true)
    } while (answer)

    println("The man won $manWinsCounter games")
}

fun rollTheDice() = (1..6).random()

fun launchNewRound(): Int {
    val computerMove = rollTheDice()
    println("The computer made its move and threw away the dice: $computerMove")

    val userMove = rollTheDice()
    println("The user made its move and threw away the dice: $userMove")

    return if (computerMove < userMove) 1
    else if (computerMove > userMove) -1
    else 0
}