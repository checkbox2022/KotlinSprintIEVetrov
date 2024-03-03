package lesson8

fun main() {
    print("Enter how many ingredients do you need: ")
    val arraySize = readln().toInt()

    val arrayIngredients: Array<String> = Array(arraySize) { it.toString() }

    arrayIngredients.forEachIndexed { index, _ ->
        print("\nEnter ingredient: ")
        arrayIngredients[index] = readln()
    }

    println(arrayIngredients.joinToString(", "))
}