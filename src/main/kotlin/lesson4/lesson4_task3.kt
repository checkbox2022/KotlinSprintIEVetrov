package lesson4

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val percentageAirHumidity = 20
    val season = "Winter"
    val isFriendlyConditionForGrowth =
        if (isWeatherSunny == true && isAwningOpen == true && percentageAirHumidity == 20 && season != "Winter"
        ) true else false
    println("Are the conditions now favorable for the growth of legumes: $isFriendlyConditionForGrowth")
}