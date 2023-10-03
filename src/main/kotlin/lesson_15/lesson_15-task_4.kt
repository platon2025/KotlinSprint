package lesson_15

/** Created by Platon2025 */

const val PRODUCT_INSTRUMENT = "музыкальный инструмент"
const val PRODUCT_COMPONENT = "компонент музыкального инструмента"

abstract class Product(
    val id: Int,
    val name: String,
    val stock: Int,
    val type: String,
)

class Instrument(
    id: Int,
    name: String,
    stock: Int, type: String = PRODUCT_INSTRUMENT,
) : Product(id, name, stock, type), SearchableForComponents

class Component(
    id: Int,
    name: String,
    stock: Int,
    val componentOf: List<Int>,
    type: String = PRODUCT_COMPONENT,
) : Product(id, name, stock, type)

interface SearchableForComponents {
    val id: Int
    val name: String
    fun searchComponents() {
        println("Выполняется поиск комплектующих для продукта $name")
    }
}

fun main() {
    val product1 = Instrument(1, "Гитара", 10)
    val product2 = Component(2, "Ремень для гитары", 5, listOf(1))
    product1.searchComponents()
}