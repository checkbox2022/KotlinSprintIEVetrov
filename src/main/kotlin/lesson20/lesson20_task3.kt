package lesson20

fun main() {

    val player1 = Player2(true)
    val player2 = Player2(false)

    val keyChecker: (Player2) -> Unit = {
        when (it.isKey) {
            true -> println("The player opened the door")
            else -> println("Player hasn't key")
        }
    }

    keyChecker(player1)
    keyChecker(player2)

}

class Player2(var isKey: Boolean)