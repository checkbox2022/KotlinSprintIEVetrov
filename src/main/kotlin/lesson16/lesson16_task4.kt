package lesson16

fun main() {
    val order1 = Order(1)
    println(order1.isReady)

    requestChangeOrderStatus(order1, true)
    println(order1.isReady)
}

class Order(private val orderId: Int, var isReady: Boolean = false) {
    fun changeOrderStatus(newStatus: Boolean) {
        isReady = newStatus
    }
}

fun requestChangeOrderStatus(order: Order, newStatusRequest: Boolean) {
    order.changeOrderStatus(newStatusRequest)
}