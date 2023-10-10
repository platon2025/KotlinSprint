package lesson_20

/** Created by Platon2025 */
const val MAX_HEALTH = 100

class User(val name: String, var health: Int) {
    val healingPotion = {
        this.health = MAX_HEALTH
        println("Лечение игрока $name проведено. Текущий уровень здоровья: $health")
    }
}

fun main() {
    val user = User("Duke Nukem", 70)
    println("Текущий уровень здоровья игрока ${user.name} - ${user.health}")
    user.healingPotion()
}