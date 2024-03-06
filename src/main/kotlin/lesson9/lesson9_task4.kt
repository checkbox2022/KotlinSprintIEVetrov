package lesson9

fun main() {
    print("Enter five ingredients: ")
    val ingredients = readln()

    val listIngredients = ingredients.split(", ").sorted()
    println(listIngredients)
}