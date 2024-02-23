/*fun main() {
    val seconds: Short = 6480
    seconds.toHMS()
}

fun Short.toHMS() = println("%02d:%02d:%02d".format(this / 3600, this % 3600 / 60, this % 60))*/

fun main() {
    val seconds: Short = 6480
    val hours: Byte = (seconds / 3600).toByte()
    val minutes: Byte = (seconds % 3600 / 60).toByte() // Если необходимо кол-во всех минут, то: seconds/60
    val secondsRest: Byte = (seconds % 3600 % 60).toByte()

    println("${timeChecker(hours)}:${timeChecker(minutes)}:${timeChecker(secondsRest)}")
}

fun timeChecker(time: Byte) = if (time < 10) "0$time" else "$time"