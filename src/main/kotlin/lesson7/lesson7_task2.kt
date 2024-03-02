package lesson7

const val MIN_CODE_NUM = 1000
const val MAX_CODE_NUM = 9999

fun main() {
    do {
        val smsCode = (MIN_CODE_NUM..MAX_CODE_NUM).random()
        println("Your authorization code: $smsCode")

        print("Enter you authorization code: ")
        val authorization = readln().toInt()

    } while (smsCode != authorization)

    println("\nHello, user! Your code is correct!")

}