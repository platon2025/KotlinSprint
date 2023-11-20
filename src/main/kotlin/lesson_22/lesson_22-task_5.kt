package lesson_22

import java.util.*

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звёздная система",
        null,
        4.367
    )
    alphaCentauri.printInfo()
}

data class GalacticGuide(
    private val name: String,
    private val description: String,
    private val date: Long?, //timestamp
    private val distance: Double,
) {
    fun printInfo() {
        println("Название объекта/события: ${getName()}")
        println("Описание: ${getDescription()}")
        if (date != null) println("Дата события: ${(getDate())}")
        println("Расстояние от Земли: ${getDistance()} св.лет")
    }

    fun getName(): String = name
    fun getDescription(): String = description
    fun getDate(): Date? {
        return if (date != null) Date(date)
        else null
    }

    fun getDistance(): Double = distance
}