package lesson10

fun main() {
    print("Enter password length: ")
    val passwordLength = readln().toInt()

    val password = passwordGenerator(passwordLength)

    println(password)
}

fun passwordGenerator(length: Int): String {
    var password = ""
    val symbolsOdd = (0..9)
    val symbolsEven = ("!\"#$%&'()*+,-./")
    var odd = true
    for (i in 1..length) {
        if (odd) {
            password += symbolsOdd.random()
            odd = !odd
        } else {
            password += symbolsEven.random()
            odd = !odd
        }
    }
    return password
}