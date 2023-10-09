package lesson_20

/** Created by Platon2025 */

class User2() {
    var isKeyFound = false

    val verifyKeyFound = {
        if (isKeyFound) println("Дверь открыта")
        else println("Дверь закрыта")
    }
}

fun main() {
    val user = User2()
    user.verifyKeyFound()
    user.isKeyFound = true
    user.verifyKeyFound()
}