package lesson_18

/** Created by Platon2025 */

open class Box {
    open fun calculateSurfaceArea(): Int = 0
}

class RectangleBox(val length: Int, val width: Int, val height: Int) : Box() {
    override fun calculateSurfaceArea() = 2 * length * width + 2 * width * height + 2 * height * length

}

class CubeBox(val length: Int) : Box() {
    override fun calculateSurfaceArea() = 6 * length * length

}

fun main() {
    val rectangleBox: Box = RectangleBox(20, 15, 10)
    val cubeBox: Box = CubeBox(15)

    println("Площадь поверхности прямоугольной посылки = ${rectangleBox.calculateSurfaceArea()}")
    println("Площадь поверхности кубической посылки = ${cubeBox.calculateSurfaceArea()}")
}