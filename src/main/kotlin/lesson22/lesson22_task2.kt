package lesson22

fun main() {

    val regular1 = Regular1("reg", "Pavel")

    val data1 = Data1("data", "Pavel")

    println(regular1) // БЕЗ имплементации через переопределенную toString() функцию получаем строковое
    // представление объекта по умолчанию. А с имплементацией с переопределенной функции toString()
    // получим необходимое строковое представление объекта класса в формате объекта с перечислением полей,
    // что и видим в получаемом выводе

    println(data1) // в дата классе получаем сразу готовое решение в виде строки с перечеслением свойств

}

class Regular1(val title: String, val author: String) {

    override fun toString(): String {
        return "Regular1(title='$title', author='$author')"

    }

}

data class Data1(val title: String, val author: String)