package lesson_16

/** Created by Platon2025 */

class Order(val id: Int, private var status: String) {
    fun changeOrderStatus(newStatus: String) {
        status = newStatus
    }

    fun getOrderStatus(): String = status
}

fun main() {
    val order = Order(1112, "Размещён")
    println("Статус заказа #${order.id}: ${order.getOrderStatus()}")
    order.changeOrderStatus("Оплачен")
    println("Статус заказа #${order.id}: ${order.getOrderStatus()}")
}