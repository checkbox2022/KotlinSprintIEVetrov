package lesson10

fun main() {
    print("Enter password length: ")
    val passwordLength = readln().toInt()

    val password = toGeneratePassword(passwordLength)

    println(password)
}

fun toGeneratePassword(length: Int): String {
    var password = ""
    val symbolsOdd = (0..9)
    val symbolsEven = ('!'..'/')

    for (i in 1..length) {
        if (i % 2 == 0) {
            password += symbolsOdd.random()
        } else {
            password += symbolsEven.random()
        }
    }
    return password
}