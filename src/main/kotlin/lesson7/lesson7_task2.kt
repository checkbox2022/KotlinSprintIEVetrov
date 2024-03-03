package lesson7

fun main() {
    val codeRange = 1000..9999

    do {
        val smsCode = codeRange.random()
        println("Your authorization code: $smsCode")

        print("Enter you authorization code: ")
        val authorization = readln().toInt()

    } while (smsCode != authorization)

    println("\nHello, user! Your code is correct!")

}