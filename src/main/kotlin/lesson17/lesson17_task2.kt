package lesson17

fun main() {
    val ship = Ship()
    println(ship.name)
    ship.name = "asda"
    println(ship.name)
}


class Ship {
    var name = "Ship"
        set(value) {
            if (value != field) field.also { println("You can't change the name!") }
        }
    var averageSpeed = 100
    var port = "Ocean"
}