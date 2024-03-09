package lesson12

const val DIFFERECNCE_KELVIN_CELSIUS = 273

fun main() {
    val day1 = Day2(299, 291, true)
    day1.showDayWeatherInfo()
}

class Day2(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean,
) {
    var dayTemperature = dayTemperature - DIFFERECNCE_KELVIN_CELSIUS
    var nightTemperature = nightTemperature - DIFFERECNCE_KELVIN_CELSIUS
    var isPrecipitation = isPrecipitation

    fun showDayWeatherInfo() {
        println(
            """
                Day temperature: $dayTemperature
                Night temperature: $nightTemperature
                Precipitation: $isPrecipitation
                
                """.trimIndent()
        )
    }
}