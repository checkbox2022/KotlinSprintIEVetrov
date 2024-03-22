package lesson22

fun main() {

    val regular1 = Regular("reg", "Pavel")
    val regular2 = Regular("reg", "Pavel")

    val data1 = Data("data", "Pavel")
    val data2 = Data("data", "Pavel")

    println(regular1 == regular2) // false - происходит сравнение ссылок на объекты в памяти

    println(data1 == data2) // true - сравнивает непосредственно значения (свойств/полей) самих объетов

}

class Regular(val title: String, val author: String)

data class Data(val title: String, val author: String)