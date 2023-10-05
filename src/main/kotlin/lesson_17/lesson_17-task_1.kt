package lesson_17

/** Created by Platon2025 */
class Quiz(riddle: String, answer: String) {
    var riddle = riddle
        set(value) {
            field = value
        }
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}