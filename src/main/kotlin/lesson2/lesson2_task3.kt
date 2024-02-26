package lesson2
const val TO_MIN_OR_SEC = 60
const val MINUTE_TO_HOUR = 60

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457
    var arrivalHours = departureHours + (travelTimeMinutes / TO_MIN_OR_SEC)
    //println(arrivalHours)
    val arrivalMinutes = if ((departureMinutes + travelTimeMinutes % TO_MIN_OR_SEC) >= MINUTE_TO_HOUR) {
        arrivalHours++
        (departureMinutes + travelTimeMinutes % TO_MIN_OR_SEC) % TO_MIN_OR_SEC
    } else departureMinutes + travelTimeMinutes % TO_MIN_OR_SEC
    println("Train arrival time: $arrivalHours:$arrivalMinutes")
}