//More uses: https://kotlinlang.org/docs/destructuring-declarations.html

package lesson_22

fun main() {
    val guide = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звёздная система",
        4.367,
        null,
    )
    println("Название объекта/события: ${guide.component1()}")
    println("Описание: ${guide.component2()}")
    println("Расстояние от Земли: ${guide.component3()} св.лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val distance: Double,
    val date: Long? = null,
)