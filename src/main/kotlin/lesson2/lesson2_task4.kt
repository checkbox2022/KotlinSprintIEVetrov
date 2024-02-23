package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val crystalAbove = (crystalOre * 1.2 - crystalOre).toInt().toByte()
    val ironAbove = (ironOre * 1.2 - ironOre).toInt().toByte()
    println("Extra crystal: $crystalAbove")
    println("Extra iron: $ironAbove")
}

