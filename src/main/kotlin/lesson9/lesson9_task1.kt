package lesson9

fun main() {
    val ingredients = listOf("onion", "tomato", "potato", "salt")

    println("The recipe contains the following ingredients: $ingredients")

    ingredients.forEach { println(it) }
}