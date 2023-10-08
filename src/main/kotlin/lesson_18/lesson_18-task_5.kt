package lesson_18

/** Created by Platon2025 */
abstract class Shape {
    fun <T> draw(shape: String, x: T, y: T) {
        println("Отрисовывается $shape с координатами x=$x y=$y")
    }
}

class Circle : Shape()

class Foursquare : Shape()

class Point : Shape()

class Screen {
    fun <T> draw(shape: Shape, x: T, y: T) {
        when (shape) {
            is Circle -> {
                Circle().draw("круг", x, y)
            }

            is Foursquare -> {
                Foursquare().draw("квадрат", x, y)
            }

            is Point -> {
                Point().draw("точка", x, y)
            }
        }
    }
}

fun main() {
    val circle = Circle()
    val foursquare = Foursquare()
    val point = Point()
    val screen = Screen()

    screen.draw(circle, 25f, 45)
    screen.draw(foursquare, 18, 24.95f)
    screen.draw(point, 0f, 10)
}