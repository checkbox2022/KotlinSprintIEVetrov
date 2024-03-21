package lesson20

fun main() {

    val robot = Robot()

    robot.say()
    robot.setModifier()
    robot.say()

}

class Robot {

    var randomWord = listOf("Hello there!", "What up?", "Let's go!", "Ok, ehhh", "Get ready").random()

    fun say() = println(randomWord)

    val setModifier: () -> Unit = {
        randomWord = randomWord.split(" ").reversed().joinToString(" ")
    }

}


