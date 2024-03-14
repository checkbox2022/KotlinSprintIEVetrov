package lesson15

fun main() {
    val duck = Duck()
    duck.swim()
    duck.fly()

    val fish = Fish()
    fish.swim()

    val gull = Gull()
    gull.fly()
}


class Duck() : MovableSwim, MovableFly

class Fish() : MovableSwim

class Gull() : MovableFly

interface MovableFly {
    fun fly() {
        println("Flying..")
    }
}

interface MovableSwim {
    fun swim() {
        println("Swimming..")
    }
}
