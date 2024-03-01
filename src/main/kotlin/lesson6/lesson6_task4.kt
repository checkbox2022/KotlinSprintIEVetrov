package lesson6

const val LAST_ATTEMPT = 1

fun main() {
    val randomNumber = (0..9).random()
    var countAttempts = 5

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