package lesson15

fun main() {
    val car = Car()
    car.board(2)
    car.move()
    car.stop()
    car.getOut()
    car.board(3)
    car.move()
    car.stop()
    car.getOut()

    val truck = Truck()
    truck.board(1)
    truck.load(2)
    truck.move()
    truck.stop()
    truck.getOut()
    truck.unload()
}

open class Car(val maxPassenger: Int = 3) : Movable, Transportable

class Truck(maxPassenger: Int = 1, val maxLiftingTons: Int = 2) : Car(maxPassenger), Liftable

interface Movable {
    fun move() {
        println("Vehicle started to move")
    }

    fun stop() {
        println("The vehicle stopped")
    }
}

interface Transportable {
    fun board(number: Int) {
        println("$number passengers boarded the vehicle")
    }

    fun getOut() {
        println("Passengers got out of the vehicle")
    }
}

interface Liftable {
    fun load(value: Int) {
        println("Loaded $value tons")
    }

    fun unload() {
        println("Cargo unloaded")
    }
}