package lesson_15

/** Created by Platon2025 */

interface Flyable {
    val name: String
    fun fly() {
        println("$name умеет летать.")
    }
}

interface Swimmable {
    val name: String
    fun swim() {
        println("$name умеет плавать.")
    }
}

class Crucian(override val name: String = "карась") : Swimmable

class Gull(override val name: String = "чайка") : Flyable, Swimmable

class Duck(override val name: String = "утка") : Flyable, Swimmable

fun main() {
    val crucian = Crucian()
    crucian.swim()

    val gull = Gull()
    gull.fly()
    gull.swim()

    val duck = Duck()
    duck.fly()
    duck.swim()
}

