package lesson12

import kotlin.random.Random

const val APRIL_DAYS = 30
const val MIN_DAY_TEMPERATURE: Byte = 0
const val MAX_DAY_TEMPERATURE: Byte = 15
const val MIN_NIGHT_TEMPERATURE: Byte = -5
const val MAX_NIGHT_TEMPERATURE: Byte = 10

fun main() {
    val listOfDays = mutableListOf<Day4>()

    repeat(APRIL_DAYS) {
        listOfDays.add(
            Day4(
                randomTemperature(MIN_DAY_TEMPERATURE, MAX_DAY_TEMPERATURE),
                randomTemperature(MIN_NIGHT_TEMPERATURE, MAX_NIGHT_TEMPERATURE),
                Random.nextBoolean()
            )
        )
    }

    val averageDayTemp: Byte = listOfDays.map { it.dayTemperature }.average().toInt().toByte()
    val averageNightTemp: Byte = listOfDays.map { it.nightTemperature }.average().toInt().toByte()
    val totalDaysPrecipitation: Byte = listOfDays.filter { it.isPrecipitation }.size.toByte()

    println(
        """
        Average day temperature: $averageDayTemp
        Average night temperature: $averageNightTemp
        Number of days with precipitation: $totalDaysPrecipitation
    """.trimIndent()
    )
}

fun randomTemperature(minTemp: Byte, maxTemp: Byte) = (minTemp..maxTemp).random().toByte()

class Day4(
    val dayTemperature: Byte,
    val nightTemperature: Byte,
    val isPrecipitation: Boolean,
)