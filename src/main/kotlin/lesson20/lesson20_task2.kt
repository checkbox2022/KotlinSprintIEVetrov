package lesson20

const val HEALTH_POTION_POWER = 35

fun main() {

    val player = Player("Pavel", 50)

    val healingPotion: (Player) -> Unit = {
        it.currentHealth += HEALTH_POTION_POWER
    }

    healingPotion(player)

    println(player.currentHealth)

}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int = 100)