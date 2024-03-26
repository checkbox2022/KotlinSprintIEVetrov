package lesson21

fun main() {

    val player = Player5("Pavel", 15)

    println(player.isHealthy())

    player.currentHealth = 100
    println(player.isHealthy())

}

class Player5(val name: String, var currentHealth: Int, val maxHealth: Int = 100)

fun Player5.isHealthy() = maxHealth == currentHealth