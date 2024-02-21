fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    val name = "Yuri Gagarin"
    println("On April 12, $year, aboard the spacecraft Vostok 1, " +
            "27-year-old cosmonaut $name became the first man to travel into space." +
            "\nTakeoff time: ${if (hour<10) "0" else ""}$hour:${if (hour<10) "0" else ""}$minute")
    hour = 10
    minute = 55
    println("Landing time: ${if (hour<10) "0" else ""}$hour:${if (hour<10) "0" else ""}$minute")
}