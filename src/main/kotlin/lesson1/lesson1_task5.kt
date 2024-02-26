package lesson1

const val TO_MIN_AND_SEC = 60
const val TO_HOURS = 3600

fun main() {
    val seconds = 6480
    val hours = (seconds / TO_HOURS)
    val minutes = (seconds % TO_HOURS / TO_MIN_AND_SEC)// Если необходимо кол-во всех минут, то: seconds/60
    val secondsRest = (seconds % TO_HOURS % TO_MIN_AND_SEC)
    val res = String.format("%02d:%02d:%02d", hours, minutes, secondsRest)
    println(res)
}



