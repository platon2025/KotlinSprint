package lesson_21

fun String.vowelCount(): Int {
    val vowels = "EeUuIiOoAaАаОоУуЫыЭэЯяЁёЮюИиЕе"
    var i = 0
    for (a in this) {
        if (vowels.indexOf(a) > -1) i++
    }
    return i
}

fun main() {
    val string = "Welcome to Сочи!"
    println("В строке \"$string\" содержится ${string.vowelCount()} гласных")
}