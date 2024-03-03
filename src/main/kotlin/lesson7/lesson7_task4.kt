package lesson7

import lesson6.SECOND

fun main() {
    print("Enter seconds: ")
    val timer = readln().toInt()

    for (i in 0 until timer) {
        println("${timer - i} seconds remaining")
        Thread.sleep(SECOND)
    }

    println("Time is over!")
}