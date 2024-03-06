package lesson8

fun main() {
    print("Enter the ingredient you are looking for: ")
    val search = readln()

    val ingredients = arrayOf("potato", "tomato", "onion", "garlic", "salt")

    val isIngredient = when (search in ingredients) {
        false -> "The ingredient is missing"
        else -> "There is a $search ingredient in the recipe"
    }

    println(isIngredient)
}