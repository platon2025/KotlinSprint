package lesson_14

/** Created by Platon2025 */
import kotlin.math.*

const val COLOR_RED = "red"
const val COLOR_GREEN = "green"
const val COLOR_BLACK = "black"
fun main() {
    val readCircle = Circle(COLOR_RED, 5)
    val greenCircle = Circle(COLOR_GREEN, 8)
    val redRectangle = Rectangle(COLOR_RED, 12, 4)
    val blackRectangle = Rectangle(COLOR_BLACK, 4, 7)
    val greenTriangle = Triangle(COLOR_GREEN, 5, 7, 9)
    val blackTriangle = Triangle(COLOR_BLACK, 6, 12, 10)

    val figuresList = listOf(readCircle, greenCircle, redRectangle, blackRectangle, greenTriangle, blackTriangle)

    println(
        "Суммарная площадь всех красных фигур составляет ${
            String.format(
                "%.2f",
                countTotalAreaByColor(figuresList, COLOR_RED)
            )
        }"
    )
    println(
        "Суммарный периметр всех красных фигур составляет ${
            String.format(
                "%.2f",
                countTotalPerimeterByColor(figuresList, COLOR_RED)
            )
        }"
    )
}

fun countTotalAreaByColor(figuresList: List<Figure>, color: String): Double {
    var totalArea = 0.0
    for (i in figuresList.indices) {
        if (figuresList[i].color != color) continue
        totalArea += figuresList[i].getArea()
    }
    return totalArea
}

fun countTotalPerimeterByColor(figuresList: List<Figure>, color: String): Double {
    var totalPerimeter = 0.0
    for (i in figuresList.indices) {
        if (figuresList[i].color != color) continue
        totalPerimeter += figuresList[i].getPerimeter()
    }
    return totalPerimeter
}

abstract class Figure {

    abstract val color: String
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class Circle(override val color: String, val radius: Int) : Figure() {
    override fun getArea() = PI * radius.toDouble().pow(2)
    override fun getPerimeter() = 2 * PI * radius
}

class Rectangle(override val color: String, val width: Int, val height: Int) : Figure() {
    override fun getArea() = (width * height).toDouble()
    override fun getPerimeter() = (width + height) * 2.0
}

class Triangle(override val color: String, val side1: Int, val side2: Int, val side3: Int) : Figure() {
    override fun getArea(): Double {
        val p: Double = (side1 + side2 + side3) / 2.0
        return sqrt(p * (p - side1) * (p - side2) * (p - side3))
    }

    override fun getPerimeter() = (side1 + side2 + side3).toDouble()
}
