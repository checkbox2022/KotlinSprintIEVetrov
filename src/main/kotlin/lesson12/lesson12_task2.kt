package lesson12

fun main() {
    val day1 = Day1(25, 18, true)
    day1.showDayWeatherInfo()
}

class Day1 constructor(
    var dayTemperature: Byte,
    var nightTemperature: Byte,
    var isPrecipitation: Boolean,
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
}