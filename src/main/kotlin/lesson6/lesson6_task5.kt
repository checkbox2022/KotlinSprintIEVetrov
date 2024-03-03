package lesson6

fun main() {
    var countAttempts = 3

    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val sumFirstAndSecond = firstNumber + secondNumber

        print("\nAdd two numbers: $firstNumber + $secondNumber = ")
        val result = readln().toInt()

        if (result == sumFirstAndSecond) {
            println("\nAuthorization was successful!")
            break
        }
    } while (countAttempts-- > 1)

    if (countAttempts == 0) println("Access is closed!")

}