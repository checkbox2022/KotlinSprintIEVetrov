package lesson16

const val ENEMY_DAMAGE = 35

fun main() {
    val player1 = Player("Pavel", 100, 25)
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment(10)
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment(15)
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment(5)
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment(11)
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment(8)
}

class Player(
    private val name: String,
    private var hp: Int,
    private var impactForce: Int
) {


    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 1) die()
        else println("You took $damage damage! Now your HP is $hp")
    }

    fun getTreatment(treatmentPoints: Int) {
        if (hp > 0) {
            hp += treatmentPoints
            println("You have healed by $treatmentPoints units! Now your HP is $hp")
        }
    }

    private fun die() {
        hp = 0
        impactForce = 0
        println("You are dead! -_-")
    }
}