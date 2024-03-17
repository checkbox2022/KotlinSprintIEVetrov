package lesson17

fun main() {
    val ship = Ship()
    println(ship.name)
    ship.name = "asda"
    println(ship.name)
}

class Ship(var averageSpeed: Int = 100, var port: String = "Ocean") {
    var name = "Ship"
        set(value) {
            if (value != field) println("You can't change the name!")
        }
}