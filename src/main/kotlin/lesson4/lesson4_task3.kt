package lesson4
const val FAVORABLE_PERCENTAGE_FOR_GROWTH = 20

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val percentageAirHumidity = 20
    val season = "Winter"

    val isFriendlyConditionForGrowth =
        if (isWeatherSunny == true && isAwningOpen == true
            && percentageAirHumidity == FAVORABLE_PERCENTAGE_FOR_GROWTH
            && season != "Winter"
        ) true
        else false

    println("Are the conditions now favorable for the growth of legumes: $isFriendlyConditionForGrowth")
}