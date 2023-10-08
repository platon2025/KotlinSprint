package lesson_19

/** Created by Platon2025 */
enum class Goods(val categoryName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцтовары"),
    MISC("Разное"),
}

fun getCategoryName(categoryCode: String): String =
    try {
        Goods.valueOf(categoryCode).categoryName
    } catch (e: IllegalArgumentException) {
        "категория не определена"
    }

class Good(val id: Int, val name: String, val categoryCode: String) {
    fun printGoodInfo() {
        println("id товара: $id\nНазвание: $name\nКатегория: ${getCategoryName(categoryCode)}\n")
    }
}

fun main() {
    val good1 = Good(1010, "Шляпа", "CLOTHES")
    val good2 = Good(2011, "Циркуль", "STATIONERY")
    val good3 = Good(3013, "Шпага", "MISC")
    val good4 = Good(4014, "Фляга", "")

    good1.printGoodInfo()
    good2.printGoodInfo()
    good3.printGoodInfo()
    good4.printGoodInfo()
}