package lesson_22

data class Film(val title: String, val director: String, val year: Short)

fun main() {
    val film = Film("Matrix", "Wachowski brothers", 1999)
    val (filmTitle, filmDirector, filmYear) = film
    println("Title: $filmTitle\nDirector: $filmDirector\nYear: $filmYear")
}