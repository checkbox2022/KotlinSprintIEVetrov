package lesson11

fun main() {

}

class RecipeCategory(
    val title: String,
    val image: String,
    val description: String,
) {
    val listOfRecipes = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) {
        listOfRecipes.add(recipe)
    }

    fun removeRecipe(recipe: Recipe) {
        listOfRecipes.remove(recipe)
    }
}

class Recipe(
    val title: String,
    val image: String,
    var cookingMethod: String,
    var isFavorite: Boolean = false,
) {
    val listOfFavorites = mutableListOf<Recipe>()

    fun addFavorite(recipe: Recipe) {
        isFavorite = true
        listOfFavorites.add(recipe)
    }

    fun removeFavorite(recipe: Recipe) {
        isFavorite = false
        listOfFavorites.remove(recipe)
    }

    val listOfIngredients = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) {
        listOfIngredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        listOfIngredients.remove(ingredient)
    }

    fun changeCookingMethod() {
        cookingMethod = readln()
    }

}

class Ingredient(
    val title: String,
    val countOfIngredient: Int,
    val ingredientVolumeMark: String,
)