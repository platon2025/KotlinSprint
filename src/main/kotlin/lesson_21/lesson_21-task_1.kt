package lesson_21

fun String.vowelCount(): Int {
    val vowels = "EeUuIiOoAaАаОоУуЫыЭэЯяЁёЮюИиЕе"
    return this.count { it in vowels }
}

fun main() {
    val string = "Welcome to Сочи!"
    println("В строке \"$string\" содержится ${string.vowelCount()} гласных")
}