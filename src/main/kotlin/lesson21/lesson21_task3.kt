package lesson21

fun main() {

    val player = Player("Pavel", 15)

    println(player.isHealthy())

    player.currentHealth = 100
    println(player.isHealthy())

}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int = 100)

fun Player.isHealthy() = maxHealth == currentHealth