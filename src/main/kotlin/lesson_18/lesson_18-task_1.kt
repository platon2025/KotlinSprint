package lesson_18

/** Created by Platon2025 */

abstract class Order {
    fun printOrderInfo(orderNumber: Int, orderContent: String) {
        println("Заказ #$orderNumber. Заказан товар: $orderContent.")
    }

    fun printOrderInfo(orderNumber: Int, orderContent: List<String>) {
        println("Заказ #$orderNumber. Заказаны следующие товары: ${orderContent.joinToString()}.")
    }
}

class SingleOrder : Order()
class BulkOrder : Order()

fun main() {
    val singleOrder: Order = SingleOrder()
    val bulkOrder: Order = BulkOrder()

    singleOrder.printOrderInfo(54, "Телескоп")
    bulkOrder.printOrderInfo(113, listOf("Зубочистки, Пассатижи"))
}