package lesson5

const val MIN_RANGE = 0
const val MAX_RANGE = 42

fun main() {
    val listOfRandomValues = (1..3).map { (MIN_RANGE..MAX_RANGE).random() }
    val listOfUserValues = mutableListOf<Int>()

    print("Enter three random numbers from $MIN_RANGE to $MAX_RANGE.\nEnter first number: ")
    listOfUserValues.add(readln().toInt())
    print("Enter second number: ")
    listOfUserValues.add(readln().toInt())
    print("Enter third number: ")
    listOfUserValues.add(readln().toInt())

    val listOfCoincidence = listOfRandomValues.intersect(listOfUserValues)

    println(
        when (listOfCoincidence.size) {
            3 -> "You won the JACKPOT! Gratz!"
            2 -> "You won main prize!"
            1 -> "You won a consolation prize!"
            else -> "Failure! :("
        }
    )
    print("The random numbers were: ${listOfRandomValues[0]}, ${listOfRandomValues[1]} and ${listOfRandomValues[2]}")
}