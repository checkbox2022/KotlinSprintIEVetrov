package lesson21

fun main() {
    val listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(listInt.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    subList(0, size).forEach {
        if (it % 2 == 0) sum += it
    }

    return sum

}