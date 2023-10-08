package lesson_19

/** Created by Platon2025 */

enum class AquariumFish(var fullName: String) {
    GUPPI("Guppi"),
    ANGEL("Angel fish"),
    GOLD("Gold fish"),
    SIAMESE("Siamese fighting fish"),
}

fun listAquariumDwellers() {
    AquariumFish.entries.forEach { println(it.fullName) }
}

fun main() {
    println("Вы можете добавить в свой аквариум следующих обитателей:")
    listAquariumDwellers()
}
