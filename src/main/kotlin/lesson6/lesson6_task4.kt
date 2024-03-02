package lesson6

const val ATTEMPTS = 5
const val LAST_ATTEMPT = 1
const val MIN_RANDOM_NUMBER = 0
const val MAX_RANDOM_NUMBER = 9

fun main() {
    val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
    var countAttempts = ATTEMPTS

    print("У вас $countAttempts попыток. Введите число: ")
    var yourNumber = readln().toInt()

    while (countAttempts > LAST_ATTEMPT && yourNumber != randomNumber) {
        countAttempts--
        print("\nНевернo! Оставшееся кол-во попыток: $countAttempts\nПопытайте удачу еще раз: ")
        yourNumber = readln().toInt()
    }

    if (yourNumber == randomNumber) println("\nIt was a great game!")
    else println("\nYou lose! Secret number was: $randomNumber")
}