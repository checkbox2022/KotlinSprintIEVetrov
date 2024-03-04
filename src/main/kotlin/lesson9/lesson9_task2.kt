package lesson9

fun main() {
    val ingredients = mutableListOf("tomato", "potato", "salt")
    println("There are basic ingredients in the recipe: $ingredients")

    println("Do you want to add any ingredient?")
    val answer = readln().lowercase()

    if (answer == "yes") {
        print("Enter the name of ingredient: ")
        val newIngredient = readln()
        ingredients.add(newIngredient)
    } else return

    println("\nNow the recipe has the following ingredients: $ingredients")
}

