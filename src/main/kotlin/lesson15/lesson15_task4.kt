package lesson15

fun main() {
    val guitar = Instrument("guitar", 5)
    guitar.searchSmt()
}

abstract class Goods(val name: String, val quantity: Int)

class Instrument(name: String, quantity: Int) : Goods(name, quantity), Searchable

class Accessory(name: String, quantity: Int) : Goods(name, quantity)

interface Searchable {
    fun searchSmt(){
        println("Searching for suitable accessories")
    }
}