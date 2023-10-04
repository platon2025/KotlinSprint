package lesson_17

/** Created by Platon2025 */

class Ship(name: String, val averageSpeed: Int, val homePort: String) {
    var name: String = name
        set(value) {
            println("Имя корабля нельзя изменить!")
        }
}

fun main() {
    var ship = Ship("Черная жемчужина", 30, "Тартуга")
    println("Имя корабля: ${ship.name}")
    ship.name = "Летучий голландец"
    println("Имя корабля: ${ship.name}")

}