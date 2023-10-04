package lesson_16

/** Created by Platon2025 */

class Order(private val orderNumber: Int, private var status: String) {
    fun changeOrderStatus(newStatus: String) {
        setNewOrderStatus(newStatus)
        println("Статус заказа #$orderNumber меняется на \"$newStatus\"")
    }

    private fun setNewOrderStatus(newStatus: String) {
        status = newStatus
    }

    fun getOrderStatus(): String = status
    fun getOrderNumber(): Int = orderNumber
}

fun main() {
    val order = Order(1112, "Размещён")
    println("Статус заказа #${order.getOrderNumber()}: ${order.getOrderStatus()}")
    order.changeOrderStatus("Оплачен")
    println("Статус заказа #${order.getOrderNumber()}: ${order.getOrderStatus()}")
}