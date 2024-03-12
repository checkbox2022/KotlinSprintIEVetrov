package lesson14

fun main() {
    val liner = Liner()

    val cargoShip = CargoShip()

    val iceBreaker = IceBreaker()
    iceBreaker.breakIce()
}

open class Liner(
    val speed: Int = 100,
    val lifting: Int = 50,
    open val capacity: Int = 100,
)

class CargoShip(
    speed: Int = 60,
    lifting: Int = 100,
    capacity: Int = 50
) : Liner(speed, lifting, capacity)

class IceBreaker(
    speed: Int = 50,
    lifting: Int = 50,
    capacity: Int = 30
) : Liner(speed, lifting, capacity) {

    fun breakIce() {
        println("Khhhhh!")
    }
}


