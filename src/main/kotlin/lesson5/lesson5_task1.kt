package lesson5
const val ACCESS_IS_OPEN = "You are WELCOME! ^^"
const val ACCESS_IS_CLOSED = "Access is CLOSED!"
const val ACCESS_RES = 15

fun main() {
    println("Solve the equation and write the answer in the input field:\n7 + 11 - 3 = ?")
    val res = readln().toInt()

    val accessStatus = if (res == ACCESS_RES) ACCESS_IS_OPEN else ACCESS_IS_CLOSED

    println(accessStatus)
}