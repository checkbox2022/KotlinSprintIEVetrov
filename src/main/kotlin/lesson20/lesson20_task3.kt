package lesson20

fun main() {

    val player1 = Player(true)
    val player2 = Player(false)

    val keyChecker: (Player) -> Unit = {
        when (it.isKey) {
            true -> println("The player opened the door")
            else -> println("Player hasn't key")
        }
    }

    keyChecker(player1)
    keyChecker(player2)

}

class Player(var isKey: Boolean)