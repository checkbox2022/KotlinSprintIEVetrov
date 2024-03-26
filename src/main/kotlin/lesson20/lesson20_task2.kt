package lesson20

fun main() {

    val player = Player3("Pavel", 50)

    val healingPotion: (Player3) -> Unit = {
        it.currentHealth = it.maxHealth
    }

    println(player.currentHealth)

    healingPotion(player)

    println(player.currentHealth)

}

class Player3(val name: String, var currentHealth: Int, val maxHealth: Int = 100)