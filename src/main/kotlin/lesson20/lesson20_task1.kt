package lesson20

fun main() {

    val userName = "Pavel"

    val greetings: () -> String = { "Happy New Year, $userName!" } // : () -> String - можно опустить (убрать)
    println(greetings())

}