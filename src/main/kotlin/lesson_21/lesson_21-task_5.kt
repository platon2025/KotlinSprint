package lesson_21

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key

fun main() {
    val map = mapOf(Pair("здоровье", 90), Pair("сила", 100), Pair("скорость", 80))
    println(map.maxCategory())
}