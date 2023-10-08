package lesson_18

/** Created by Platon2
 *
 */
abstract class Animal(val name: String) {
    fun play() {
        println("$name играет")
    }

    fun sleep() {
        println("$name спит")
    }

    open fun eat() {
        println("$name ест")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест ягоды .. а это точно про лису?")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name - грызёт кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name - ест рыбу")
    }
}

fun main() {
    val fox: Animal = Fox("Лиса")
    val dog: Animal = Dog("Собака")
    val cat: Animal = Cat("Кошка")

    fox.eat()
    dog.eat()
    cat.eat()
}