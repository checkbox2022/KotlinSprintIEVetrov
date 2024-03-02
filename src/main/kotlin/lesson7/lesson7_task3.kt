package lesson7

const val START_NUM = 0

fun main() {
    print("Enter number for even progression: ")
    val numberEnd = readln().toInt()

    for (i in START_NUM..numberEnd step 2) println(i)
}