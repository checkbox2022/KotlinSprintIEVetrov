package lesson14

fun main() {
    val liner = Liner1()
    liner.getShipInfo()
    liner.extendLadder()

    val cargoShip = CargoShip1()
    cargoShip.getShipInfo()
    cargoShip.extendLadder()

    val iceBreaker = IceBreaker1()
    iceBreaker.getShipInfo()
    iceBreaker.breakIce()
    iceBreaker.extendLadder()
}

open class Liner1(
    val speed: Int = 100,
    val lifting: Int = 50,
    open val capacity: Int = 100,
) {
    open fun extendLadder() {
        println("Horizontal ladder extends\n")
    }

    fun getShipInfo() {
        println(
            """
            Ship speed: $speed
            Ship lifting: $lifting
            Ship capacity: $capacity
        """.trimIndent()
        )
    }
}

class CargoShip1(
    speed: Int = 60,
    lifting: Int = 100,
    capacity: Int = 50
) : Liner1(speed, lifting, capacity) {
    override fun extendLadder() {
        println("Cargo ship activates loading crane\n")
    }
}

class IceBreaker1(
    speed: Int = 50,
    lifting: Int = 50,
    capacity: Int = 30
) : Liner1(speed, lifting, capacity) {

    fun breakIce() {
        println("Khhhhh!")
    }

    override fun extendLadder() {
        println("The gates opens from the stern side\n")
    }
}