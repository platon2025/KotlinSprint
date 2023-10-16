package lesson_22

class RegularBook1(val title: String, val author: String)
data class DataBook1(val title: String, val author: String)

fun main() {
    val regBook = RegularBook1("Из ненаписанного", "А.С.Пушкин")
    val dataBook = DataBook1("Из ненаписанного", "А.С.Пушкин")

    println("Обычный класс: $regBook") //строковое представление объекта обычного класса выглядит как его уникальный id
    println("Data класс: $dataBook") //строковое представление объекта data-класса выглядит как представление параметров объекта, переданных при его инициализации, в формате ["имя"="значение"]
}