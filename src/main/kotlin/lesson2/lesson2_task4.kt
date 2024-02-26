package lesson2

const val PERCENTAGE_BONUS = 20

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val percentageBonusCoefficient = (PERCENTAGE_BONUS+100)/100.toFloat()

    val crystalAbove = (crystalOre * percentageBonusCoefficient - crystalOre).toInt().toByte()
    val ironAbove = (ironOre * percentageBonusCoefficient - ironOre).toInt().toByte()

    println("Extra crystal: $crystalAbove")
    println("Extra iron: $ironAbove")
}

