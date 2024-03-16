package lesson16

const val ENEMY_DAMAGE = 35

fun main() {
    val player1 = Player()
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment()
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment()
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment()
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment()
    player1.takeDamage(ENEMY_DAMAGE)
    player1.getTreatment()
}

class Player {
    private var hp = 100
    private var impactForce = 25

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 1) die()
        else println("You took $damage damage! Now your HP is $hp")
    }

    fun getTreatment() {
        if (hp > 0) {
            val treatmentPoints = 10
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