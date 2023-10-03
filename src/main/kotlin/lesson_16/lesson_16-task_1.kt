package lesson_16

/** Created by Platon2025 */
const val MIN_SCORE = 1
const val MAX_SCORE = 6

class Dice(private val score: Int = (MIN_SCORE..MAX_SCORE).random()) {
    fun getScore() = score
}

fun main() {
    val dice = Dice()
    println(dice.getScore())
}