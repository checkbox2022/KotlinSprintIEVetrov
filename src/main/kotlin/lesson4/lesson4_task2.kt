package lesson4

fun main() {
    var weight = 20
    var volume = 80
    println("Cargo with weight = $weight kg and volume = $volume liter matches the category: ${if (weight >= 35 && weight <= 100 && volume <= 100) true else false}")

    weight = 50
    volume = 100
    println("Cargo with weight = $weight kg and volume = $volume liter matches the category: ${if (weight >= 35 && weight <= 100 && volume <= 100) true else false}")
}