package lesson_21

const val MAX_HEALTH = 100

class Player(val name: String, var health: Int) {
    val healingPotion = {
        this.health = MAX_HEALTH
        println("Лечение игрока $name проведено. Текущий уровень здоровья: $health")
    }
}

fun Player.isHealthy(): Boolean = this.health == MAX_HEALTH

fun main() {
    val player = Player("Duke Nukem", 70)
    println("Текущее значение isHealthy: ${player.isHealthy()}")
    player.healingPotion()
    println("Текущее значение isHealthy: ${player.isHealthy()}")
}