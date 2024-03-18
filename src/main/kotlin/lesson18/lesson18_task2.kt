package lesson18

import kotlin.random.Random

fun main() {
    val fourSidesDice: Dice = FourSidesDice()

    val sixFourSides: Dice = SixSidesDice()

    val eightFourSides: Dice = EightSidesDice()


    val listOfDices: List<Dice> = listOf(fourSidesDice, sixFourSides, eightFourSides)

    listOfDices.forEach {
        it.rollDice()
    }

}

abstract class Dice {
    abstract fun rollDice()
}

class FourSidesDice : Dice() {
    private val sides = 4

    override fun rollDice() {
        val result = Random.nextInt(1, sides)
        println("You rolled 4-sides dice with result: $result")
    }
}

class SixSidesDice : Dice() {
    private val sides = 6

    override fun rollDice() {
        val result = Random.nextInt(1, sides)
        println("You rolled 6-sides dice with result: $result")
    }
}

class EightSidesDice : Dice() {
    private val sides = 8

    override fun rollDice() {
        val result = Random.nextInt(1, sides)
        println("You rolled 8-sides dice with result: $result")
    }
}