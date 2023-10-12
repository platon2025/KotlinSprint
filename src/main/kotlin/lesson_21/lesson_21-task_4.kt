package lesson_21

import java.io.File

fun File.saveTextToFile(text: String) {
    this.createNewFile()
    this.writeText(text.lowercase() + this.readText())
}

fun main() {
    val file = File("word.txt")
    file.saveTextToFile("Слово1")
    println(file.readText())
    file.saveTextToFile("Слово2")
    println(file.readText())
}