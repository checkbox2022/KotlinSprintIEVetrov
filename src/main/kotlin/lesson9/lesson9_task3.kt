package lesson9

fun main() {
    val recipeList = listOf(2, 50, 15)

    print("How many portions do you need: ")
    val portions = readln().toInt()

    val recipeListPortions = recipeList.map { it * portions }

    println(
        "For $portions servings you will need:" +
                "\nEggs   = ${recipeListPortions[0]} pieces" +
                "\nMilk   = ${recipeListPortions[1]} ml" +
                "\nButter = ${recipeListPortions[2]} g"
    )
}