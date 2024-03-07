package lesson9

import java.util.*

const val MAX_INGREDIENTS = 5

fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..MAX_INGREDIENTS) {
        print("Enter ingredient №$i: ")
        ingredients.add(readln())
    }

    val ingredientsSortSet = ingredients.toSet().sorted()

    println(ingredientsSortSet.joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}