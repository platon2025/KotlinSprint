package lesson_20

/** Created by Platon2025 */

fun main() {
    val elementsList = listOf(
        "Кнопка1",
        "Кнопка2",
        "Кнопка3",
        "Кнопка4",
        "Кнопка5",
        "Кнопка6",
        "Кнопка7",
        "Кнопка8",
        "Кнопка9",
        "Кнопка10"
    )

    val elementsMap: MutableMap<String, () -> Unit> = mutableMapOf()

    elementsList.forEach {
        elementsMap += Pair(it, { println("Нажата $it") })
    }

    var i = 1

    for (element in elementsMap) {
        if (i % 2 == 0) element.value()
        i++
    }

}