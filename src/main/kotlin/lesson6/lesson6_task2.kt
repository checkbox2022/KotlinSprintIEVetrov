package lesson6

const val SECOND: Long = 1000

fun main() {
    print("Enter how many seconds do you need before PAUSE: ")
    val pauseTime = readln().toInt()
    Thread.sleep(pauseTime * SECOND)

    println("$pauseTime seconds have passed!")
}