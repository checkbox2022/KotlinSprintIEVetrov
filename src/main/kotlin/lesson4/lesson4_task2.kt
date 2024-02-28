package lesson4
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    var weight = 20
    var volume = 80
    println("Cargo with weight = $weight kg and volume = $volume liter matches the category: " +
            "${weight >= MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")

    weight = 50
    volume = 100
    println("Cargo with weight = $weight kg and volume = $volume liter matches the category: " +
            "${weight >= MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")
}