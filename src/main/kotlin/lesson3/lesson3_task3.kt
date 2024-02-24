package lesson3

fun main() {
    println("Enter the number required for multiplication:")
    val number= readln().toInt()
    var multy:Byte = 1
    println("$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n" +
            "$number * ${multy} = ${number * multy++}\n")

}