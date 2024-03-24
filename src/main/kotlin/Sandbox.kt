fun main() {

    foo()

}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // прерывается не только данная лямбда, но и вся функция foo()
        println(it)
    }
    println("эта строка не достижима")
}


