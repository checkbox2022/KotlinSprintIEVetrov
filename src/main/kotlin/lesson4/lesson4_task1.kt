package lesson4
const val TOTAL_NUMBER_TABLES = 13

fun main() {
    val todayBookedTables = 13
    val tomorrowBookedTables = 9

    println("available tables for today: ${TOTAL_NUMBER_TABLES > todayBookedTables}")
    println("available tables for tomorrow: ${TOTAL_NUMBER_TABLES > tomorrowBookedTables}")
}