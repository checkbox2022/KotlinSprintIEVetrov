package lesson8

fun main() {
    print("Enter the ingredient you are looking for: ")
    val search = readln()

    val ingredients = arrayOf("potato", "tomato", "onion", "garlic", "salt")
    var isIngredient = "The ingredient is missing"

    for (i in ingredients) {
        if (i == search) isIngredient = "There is a $search ingredient in the recipe"
    }

    println(isIngredient)


}