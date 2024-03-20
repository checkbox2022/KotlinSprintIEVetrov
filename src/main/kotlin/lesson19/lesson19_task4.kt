package lesson19

fun main() {

    val tank = Tank()

    tank.fire()

    tank.loadCartridge(Cartridge.RED)
    tank.fire()

    tank.loadCartridge(Cartridge.GREEN)
    tank.fire()

    tank.loadCartridge(Cartridge.BLUE)
    tank.fire()

}

enum class Cartridge(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var ammunition: Cartridge? = null) {

    fun loadCartridge(cartridge: Cartridge) {
        ammunition =
            when (cartridge) {
                Cartridge.BLUE -> Cartridge.BLUE.also { println("You loaded the ${Cartridge.BLUE.name} cartridge") }
                Cartridge.GREEN -> Cartridge.GREEN.also { println("You loaded the ${Cartridge.GREEN.name} cartridge") }
                Cartridge.RED -> Cartridge.RED.also { println("You loaded the ${Cartridge.RED.name} cartridge") }
            }
    }

    fun fire() {
        if (ammunition == null) println("Cartridges need to be loaded!\n")
        else println("The tank fired and dealt ${ammunition?.damage} damage\n")
    }

}