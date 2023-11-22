//More uses: https://kotlinlang.org/docs/destructuring-declarations.html

package lesson_22

fun main() {
    val guide = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звёздная система",
        null,
        4.367,
    )
    println("Название объекта/события: ${guide.component1()}")
    println("Описание: ${guide.component2()}")
    println("Расстояние от Земли: ${guide.component4()} св.лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Long? = null,
    val distance: Double,
)