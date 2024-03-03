package lesson6

fun main() {
    print("Enter how many seconds do you need before PAUSE: ")
    var pauseTime = readln().toInt()

    while (pauseTime > 0) {
        println("Seconds remaining: ${pauseTime--}")
        Thread.sleep(SECOND)
    }
    println("\nTime is over!")
}