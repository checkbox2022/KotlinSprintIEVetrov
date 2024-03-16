package lesson16

import kotlin.random.Random

const val MIN_NUMBER: Int = 1
const val MAX_NUMBER: Int = 6

fun main() {
    val dice1 = Dice()
    dice1.showDiceResult()
}

class Dice {
    private val randomSide = Random.nextInt(MIN_NUMBER, MAX_NUMBER)
    fun showDiceResult() = println(randomSide)
}