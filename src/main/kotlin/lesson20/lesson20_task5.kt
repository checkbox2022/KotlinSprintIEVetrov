package lesson20

fun main() {

    val robot = Robot()

    robot.say()
    robot.setModifier { it.split(" ").reversed().joinToString(" ") }
    robot.say()

}

class Robot {

    private var modifier: ((String) -> String) = { it }

    var buffer: String? = null

    val randomSentence = listOf("Hello there!", "What up?", "Let's go!", "Ok, ehhh", "Get ready").random()

    fun say() {
        val sentence = buffer ?: randomSentence
        println(modifier(sentence))
        buffer = sentence
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

}