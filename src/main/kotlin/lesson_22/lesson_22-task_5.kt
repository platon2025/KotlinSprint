package lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звёздная система",
        4.367,
        null,
    )
    val (name, description, distance) = alphaCentauri
    println("Название объекта/события: $name")
    println("Описание: $description")
    println("Расстояние от Земли: $distance св.лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val distance: Double,
    val date: Long? = null,
)