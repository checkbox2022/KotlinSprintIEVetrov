package lesson18

fun main() {
    val order1: Goods = SingleOrder(1, "Hat")
    order1.printOrder()

    val order2: Goods = SeveralOrders(2, listOf("T-short", "Socks"))
    order2.printOrder()

}

open class Goods {
    open fun printOrder() = println()
}

class SingleOrder(
    val idOrder: Int,
    val goods: String
) : Goods() {
    override fun printOrder() {
        println("Заказан товар: $goods")
    }
}

class SeveralOrders(
    val idOrder: Int,
    val goods: List<String>
) : Goods() {
    override fun printOrder() {
        println("Заказаны товары: $goods")
    }
}