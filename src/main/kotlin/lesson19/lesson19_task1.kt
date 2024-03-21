package lesson19

fun main() {

    val aquarium = mutableListOf<Fish>()

    println("List of fish that you can add to the aquarium: ")
    Fish.values().forEach {
        aquarium.add(it)
        println(it.title)
    }

}

enum class Fish(val title: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish"),
}