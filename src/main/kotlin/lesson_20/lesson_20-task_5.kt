package lesson_20

/** Created by Platon2025 */

class Robot(var speechModifier: (String) -> String = { phrase: String -> phrase }) {
    fun setModifier(modifier: (String) -> String) {
        this.speechModifier = modifier
    }

    fun say(phrase: String) {
        println(speechModifier(phrase))
    }
}

fun main() {
    val phrases = listOf(
        "Я таблетки не люблю, я ими давлюсь",
        "Какой вы искренний человек, как пожарный",
        "Ничё не понимаю, надо слесаря по компьютерам вызывать",
        "Я, дорогой, вам сейчас травмы буду наносить",
        "Ай-да молодец. Выдайте мне 10 рублей"
    )
    val modifier = { phrase: String ->
        phrase.reversed()
    }
    val robot = Robot()
    val phrase = phrases.random()
    robot.say(phrase)
    robot.setModifier(modifier)
    robot.say(phrase)

}