package lesson15

fun main() {
    val mondayTemp = Temperature(25)
    val mondayPrec = PrecipitationAmount(10)

    val server = WeatherServer()
    server.sendData(mondayTemp)
    server.sendData(mondayPrec)
}

abstract class WeatherStationStats()

class Temperature(val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer : SendingData {
    override fun sendData(data: WeatherStationStats) {
        if (data is Temperature) println("Temperature today is ${data.temperature} degrees")
        else if (data is PrecipitationAmount) println("${data.precipitationAmount} mm of precipitation fell today")
    }

}

interface SendingData {
    fun sendData(data: WeatherStationStats)
}

