package lesson19

fun main() {

    val aquarium = mutableListOf<Fish>()

    println("List of fish that you can add to the aquarium: ")
    Fish.values().forEach {
        aquarium.add(it)
        println("$it")
    }

}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}