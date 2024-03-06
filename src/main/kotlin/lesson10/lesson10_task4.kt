package lesson10

fun main() {
    var manWinsCounter = 0

    do {
        manWinsCounter += launchNewRound()
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

    if (computerMove < userMove) {
        println("User WIN!")
        return 1
    }
    else if (computerMove > userMove) println("Computer WIN!")
    else println("Draw!")

    return 0
}