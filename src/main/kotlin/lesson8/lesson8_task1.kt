package lesson8

fun main() {
    val arrViewWeek = intArrayOf(17, 22, 42, 11, 6, 37, 15)
    var sumViews = 0

    for (i in arrViewWeek) {
        sumViews += i
    }

    println(sumViews)
}