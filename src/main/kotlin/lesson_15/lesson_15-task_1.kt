package lesson_15

/** Created by Platon2025 */

interface CanFly {
    fun canFly()
}

interface CanSwim {
    fun canSwim()
}

abstract class LakeDweller : CanFly, CanSwim {
    abstract val name: String
}

class Crucian(override val name: String = "карась") : LakeDweller() {
    override fun canFly() {
        println("$name не умеет летать.")
    }

    override fun canSwim() {
        println("$name умеет плавать.")
    }

}

class Gull(override val name: String = "чайка") : LakeDweller() {
    override fun canFly() {
        println("$name умеет летать.")
    }

    override fun canSwim() {
        println("$name умеет плавать.")
    }
}

class Duck(override val name: String = "утка") : LakeDweller() {
    override fun canFly() {
        println("$name умеет летать.")
    }

    override fun canSwim() {
        println("$name умеет плавать.")
    }

}

fun main() {
    val crucian = Crucian()
    crucian.canFly()
    crucian.canSwim()

    val gull = Gull()
    gull.canFly()
    gull.canSwim()

    val duck = Duck()
    duck.canFly()
    duck.canSwim()
}

