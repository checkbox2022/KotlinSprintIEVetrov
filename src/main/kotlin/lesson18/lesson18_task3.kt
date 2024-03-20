package lesson18

fun main() {
    val fox = Fox("Allie")

    val dog = Dog("Akai")

    val cat = Cat("Mars")

    val listTamagotchi = listOf(fox, dog, cat)
    listTamagotchi.forEach {
        it.play()
        it.eat()
        it.play()
        println()
    }

}

abstract class Tamagotchi {
    abstract fun eat()
    abstract fun sleep()
    abstract fun play()
}

class Fox(val name: String) : Tamagotchi() {

    private val food = "berries"

    override fun eat() {
        println("$name eats $food")
    }

    override fun sleep() {
        println("$name is sleeping")
    }

    override fun play() {
        println("$name is playing")
    }

}

class Dog(val name: String) : Tamagotchi() {
    private val food = "bones"

    override fun eat() {
        println("$name eats $food")
    }

    override fun sleep() {
        println("$name is sleeping")
    }

    override fun play() {
        println("$name is playing")
    }

}

class Cat(val name: String) : Tamagotchi() {
    private val food = "fish"

    override fun eat() {
        println("$name eats $food")
    }

    override fun sleep() {
        println("$name is sleeping")
    }

    override fun play() {
        println("$name is playing")
    }

}
