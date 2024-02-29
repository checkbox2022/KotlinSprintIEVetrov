package lesson5
const val ACCESS_IS_OPEN = "You are WELCOME! ^^"
const val ACCESS_IS_CLOSED = "Access is CLOSED!"

const val FIRST_NUM_CHECK = 7
const val SECOND_NUM_CHECK = 11
const val THIRD_NUM_CHECK = 3
const val ACCESS_RES = 15


fun main() {
    println("Solve the equation and write the answer in the input field:\n$FIRST_NUM_CHECK + $SECOND_NUM_CHECK - $THIRD_NUM_CHECK = ?")
    val res = readln().toInt()

    val accessStatus = if (res == ACCESS_RES) ACCESS_IS_OPEN else ACCESS_IS_CLOSED

    println(accessStatus)
}