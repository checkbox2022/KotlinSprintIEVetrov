package lesson6

const val SECOND: Long = 1000

fun main() {
    print("Enter how many seconds do you need before PAUSE: ")
    var pauseTime = readln().toInt()

    while (pauseTime > 0) {
        println("Seconds remaining: ${pauseTime--}")
        Thread.sleep(SECOND)
    }
    println("\nTime is over!")
}