package lesson2

import kotlin.math.pow

fun main() {
    val sum: Int = 70000
    val percentage: Double = 16.7
    val years: Int = 20
    val total = sum * (1 + percentage / 100).pow(years)
    println(String.format("%.3f", total))
}