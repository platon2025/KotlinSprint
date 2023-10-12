package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var summ = 0
    this.forEach { if (it % 2 == 0) summ += it }
    return summ
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(list.evenNumbersSum())
}