package lesson_21

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key

fun main() {
    val map = mapOf("здоровье" to 90, "сила" to 100, "скорость" to 80)
    println(map.maxCategory())
}