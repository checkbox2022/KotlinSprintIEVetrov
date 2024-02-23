package lesson2

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457
    var arrivalHours = departureHours + (travelTimeMinutes / 60)
    //println(arrivalHours)
    val arrivalMinutes = if ((departureMinutes + travelTimeMinutes % 60) >= 60) {
        arrivalHours++
        (departureMinutes + travelTimeMinutes % 60) % 60
    } else departureMinutes + travelTimeMinutes % 60
    println("Train arrival time: $arrivalHours:$arrivalMinutes")
}