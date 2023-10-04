package lesson_17

/** Created by Platon2025 */
const val SECRET_FOLDER_ALERT: String = "скрытая папка"
const val SECRET_FOLDER_FILES_NUM = 0

class Folder(name: String, numberOfFiles: Int, var isHidden: Boolean) {
    var name = name
        get() = if (!isHidden) field else SECRET_FOLDER_ALERT

    var numberOfFiles = numberOfFiles
        get() = if (!isHidden) field else SECRET_FOLDER_FILES_NUM
}

fun main() {
    val folder = Folder("Мои Документы", 100500, false)
    println("Папка \"${folder.name}\" содержит ${folder.numberOfFiles} файлов")
    folder.isHidden = true
    println("Папка \"${folder.name}\" содержит ${folder.numberOfFiles} файлов")
}