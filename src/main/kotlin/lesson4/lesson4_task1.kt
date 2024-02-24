package lesson4

fun main() {
    val totalNumberOfTables = 13
    val todayBookedTables = 13
    val tomorrowBookedTables = 9

    println("available tables for today: ${if (totalNumberOfTables - todayBookedTables > 0) true else false}")
    println("available tables for tomorrow: ${if (totalNumberOfTables - tomorrowBookedTables > 0) true else false}")
}