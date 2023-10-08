package lesson_18

/** Created by Platon2025 */

abstract class Order() {
    abstract fun getOrderInfo(): String
}

class SingleOrder(val orderNumber: Int, val orderContent: String) : Order() {
    override fun getOrderInfo(): String {
        return "Заказ #$orderNumber. Заказан товар: $orderContent."
    }
}

class BulkOrder(val orderNumber: Int, val orderContent: List<String>) : Order() {
    override fun getOrderInfo(): String {
        return "Заказ #$orderNumber. Заказаны следующие товары: ${orderContent.joinToString()}."
    }
}

fun main() {
    val singleOrder: Order = SingleOrder(54, "Телескоп")
    val bulkOrder: Order = BulkOrder(113, listOf("Зубочистки, Пассатижи"))

    println(singleOrder.getOrderInfo())
    println(bulkOrder.getOrderInfo())

}