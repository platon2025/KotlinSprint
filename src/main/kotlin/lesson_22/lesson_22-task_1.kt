package lesson_22

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)

fun main() {
    val regBook1 = RegularBook("Из ненаписанного", "А.С.Пушкин")
    val regBook2 = RegularBook("Из ненаписанного", "А.С.Пушкин")
    val dataBook1 = DataBook("Из ненаписанного", "А.С.Пушкин")
    val dataBook2 = DataBook("Из ненаписанного", "А.С.Пушкин")

    println("Сравнение обычный класс: ${regBook1 == regBook2}")
    println("Сравнение data класс: ${dataBook1 == dataBook2}")
}