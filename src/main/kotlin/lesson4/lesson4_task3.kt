package lesson4

const val FAVORABLE_PERCENTAGE_FOR_GROWTH = 20
const val FAVORABLE_SUNNY_WEATHER = true
const val AWNING_IS_OPENED = true
const val UNFAVORABLE_SEASON = "Winter"

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val percentageAirHumidity = 20
    val season = "Winter"

    val isFriendlyConditionForGrowth =
        (isWeatherSunny == FAVORABLE_SUNNY_WEATHER
                && isAwningOpen == AWNING_IS_OPENED
                && percentageAirHumidity == FAVORABLE_PERCENTAGE_FOR_GROWTH
                && season != UNFAVORABLE_SEASON
                )

    println("Are the conditions now favorable for the growth of legumes: $isFriendlyConditionForGrowth")
}