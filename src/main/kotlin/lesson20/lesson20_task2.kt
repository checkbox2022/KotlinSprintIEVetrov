package lesson20

fun main() {

    val player = Player("Pavel", 50)

    val healingPotion: (Player) -> Unit = {
        it.currentHealth = it.maxHealth
    }

    println(player.currentHealth)

    healingPotion(player)

    println(player.currentHealth)

}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int = 100)