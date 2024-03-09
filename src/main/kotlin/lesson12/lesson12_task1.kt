package lesson12

fun main() {
    val day1 = Day()
    day1.dayTemperature = 15
    day1.nightTemperature = 5
    day1.isPrecipitation = true
    day1.showDayWeatherInfo()

    val day2 = Day()
    day2.dayTemperature = 17
    day2.nightTemperature = 8
    day2.isPrecipitation = false
    day2.showDayWeatherInfo()
}

class Day constructor(){
    var dayTemperature: Byte = 0
    var nightTemperature: Byte = 0
    var isPrecipitation:Boolean = false

    fun showDayWeatherInfo(){
        println("""
                Day temperature: $dayTemperature
                Night temperature: $nightTemperature
                Precipitation: $isPrecipitation
                
                """.trimIndent())
    }
}