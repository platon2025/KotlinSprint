package lesson_17

/** Created by Platon2025 */

class Ship(name: String, val averageSpeed: Int, homePort: String) {
    var name: String = name
        set(value) {
            println("Имя корабля нельзя изменить!")
        }
    var homePort: String = homePort
        set(value) {
            field = value
        }
}

fun main() {
    val ship = Ship("Черная жемчужина", 30, "Тартуга")
    println("Имя корабля: ${ship.name}, порт приписки: ${ship.homePort}")
    ship.name = "Летучий голландец"
    ship.homePort = "Порт-Роял"
    println("Имя корабля: ${ship.name}, порт приписки: ${ship.homePort}")

}