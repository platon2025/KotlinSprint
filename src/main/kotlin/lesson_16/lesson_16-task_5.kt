package lesson_16

/** Created by Platon2025 */
const val MAX_HEALTH = 100

class Fighter(val name: String, var health: Int, var power: Int) {
    var canGetTreatment = true
    private fun death() {
        health = 0
        power = 0
        canGetTreatment = false
        println("$name погиб.")
    }

    fun getDamage(damageLevel: Int) {
        health += -damageLevel
        if (health <= 0) death()
        else println("$name пропустил удар силой $damageLevel. Остаток здоровья: $health")
    }

    fun getTreatment(treatmentLevel: Int) {
        if (canGetTreatment) {
            var treatmentUsed = treatmentLevel
            if (health + treatmentLevel > MAX_HEALTH) treatmentUsed = MAX_HEALTH - health
            health += treatmentUsed
            if (health > MAX_HEALTH) health = MAX_HEALTH
            println("$name получил лечение силой $treatmentUsed. Остаток здоровья: $health")
        }
    }

    fun strike(user: String, damageLevel: Int = power) {
        println("$name нанёс урон бойцу $user силой $damageLevel")
    }
}

fun main() {
    val fighter = Fighter("Duke Nukem", 100, 30)
    println("Уровень здоровья: ${fighter.health}, сила : ${fighter.power}, способность лечиться: ${fighter.canGetTreatment}")
    fighter.strike("Sam Stone")
    fighter.getDamage(30)
    fighter.getDamage(25)
    fighter.strike("Sam Stone")
    fighter.getDamage(30)
    fighter.getTreatment(20)
    fighter.getDamage(25)
    fighter.getDamage(20)
    println("Уровень здоровья: ${fighter.health}, сила : ${fighter.power}, способность лечиться: ${fighter.canGetTreatment}")
}