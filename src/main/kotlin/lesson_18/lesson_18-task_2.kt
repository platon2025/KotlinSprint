package lesson_18

/** Created by Platon2025 */

abstract class Dice {
    abstract val facesNum: Int
    fun getScore() = (1..facesNum).random()
}

class DiceOf4 : Dice() {
    override val facesNum = 4
}

class DiceOf6 : Dice() {
    override val facesNum = 6
}

class DiceOf8 : Dice() {
    override val facesNum = 8
}

fun main() {
    val dice4: Dice = DiceOf4()
    val dice6: Dice = DiceOf6()
    val dice8: Dice = DiceOf8()
    println(dice4.getScore())
    println(dice6.getScore())
    println(dice8.getScore())
}