package lesson8

fun main() {
    print("Enter the ingredient you are looking for: ")
    val search = readln()

    val ingredients = arrayOf("potato", "tomato", "onion", "garlic", "salt")

    val isIngredient = when (ingredients.indexOf(search)) {
        -1 -> "The ingredient is missing"
        else -> "There is a $search ingredient in the recipe"
    }

    println(isIngredient)
}