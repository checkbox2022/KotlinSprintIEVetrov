package lesson16

fun main() {
    val order1 = Order(1)
    order1.requestChangeOrderStatus(true)
}

class Order(private val orderId: Int, private var isReady: Boolean = false) {
    private fun changeOrderStatus(newStatus: Boolean) {
        isReady = newStatus
    }

    fun requestChangeOrderStatus(newStatusRequest: Boolean) {
        changeOrderStatus(newStatusRequest)
    }
}

