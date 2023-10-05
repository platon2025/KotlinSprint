package lesson_18

/** Created by Platon2025 */

class Order() {
    fun printOrderInfo(orderNumber: Int, orderContent: String) {
        println("Заказ #$orderNumber. Заказан товар: $orderContent.")
    }

    fun printOrderInfo(orderNumber: Int, orderContent: List<String>) {
        println("Заказ #$orderNumber. Заказаны следующие товары: ${orderContent.joinToString()}.")
    }
}

fun main() {
    val order = Order()

    order.printOrderInfo(54, "Телескоп")
    order.printOrderInfo(113, listOf("Зубочистки, Пассатижи"))
}