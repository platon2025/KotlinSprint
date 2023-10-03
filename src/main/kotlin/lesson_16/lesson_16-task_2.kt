package lesson_16

/** Created by Platon2025 */

private const val PI = 3.14f

class Circle(private val radius: Int) {
    fun getArea() = PI * radius * radius
    fun getPerimeter() = 2 * PI * radius
}

fun main() {
    val circle = Circle(5)
    println("Площадь круга: ${circle.getArea()}")
    println("Длина окружности: ${circle.getPerimeter()}")
}