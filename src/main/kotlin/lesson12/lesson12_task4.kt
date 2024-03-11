package lesson12

fun main() {
    val day1 = Day3(25, 10, true)
}

class Day3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
) {

    fun showDayWeatherInfo() {
        println(
            """
                Day temperature: $dayTemperature
                Night temperature: $nightTemperature
                Precipitation: $isPrecipitation
                
                """.trimIndent()
        )
    }

    init {
        showDayWeatherInfo()
    }
}