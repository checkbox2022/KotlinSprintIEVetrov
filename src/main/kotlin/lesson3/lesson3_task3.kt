package lesson3

fun main() {
    val number = 7
    var multy: Byte = 1
    println(
        "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n" +
                "$number * ${multy} = ${number * multy++}\n"
    )
}