package lesson8

fun main() {
    val ingredients = arrayOf("potato", "tomato", "onion", "garlic", "salt")
    println(ingredients.joinToString(", "))

    print("\nWhich ingredient do you want to replace: ")
    val ingredientSearch = readln()

    if (ingredientSearch !in ingredients) println("\nThere is no such ingredient on the list!")
    else {
        print("\nSpecify which ingredient you need to replace the current one with: ")
        val ingredientReplace = readln()

        val indexToReplace = (ingredients.indexOf(ingredientSearch))

        ingredients[indexToReplace] = ingredientReplace

        println("\nReady! You have saved a new list of ingredients:\n[${ingredients.joinToString(", ")}]")
    }
}