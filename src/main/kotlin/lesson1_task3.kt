fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    val name = "Yuri Gagarin"
    var time = timeConvert(hour,minute)
    println("On April 12, $year, aboard the spacecraft Vostok 1, " +
            "27-year-old cosmonaut $name became the first man to travel into space." +
            "\nTakeoff time: $time")
    hour = 10
    minute = 55
    time = timeConvert(hour,minute)
    println("Landing time: $time")
}
fun isTimeLessThenTen (time:Int) = if (time<10) "0$time" else time.toString()
fun timeConvert (hour:Int,minute:Int) = "time: ${isTimeLessThenTen(hour)}:${isTimeLessThenTen(minute)}"