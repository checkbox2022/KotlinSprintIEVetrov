package lesson20

fun main() {

    val list = listOf("a", "b", "c", "d", "e", "f")

    val mapLambda = list.map { unit: String -> { "Pressed \"$unit\" element" } }

    mapLambda.forEachIndexed { index, unit ->
        if (index % 2 == 0) println(unit())
    }

}