package lesson_15

/** Created by Platon2025 */

const val STATUS_USER = "Польователь"
const val STATUS_ADMIN = "Администратор"

abstract class Unit(val userName: String, val userStatus: String) {
    fun readMessage() {
        println("$userStatus $userName читает сообщение")
    }

    fun sendMessage() {
        println("$userStatus $userName отправляет сообщение")
    }
}

class User(userName: String, userStatus: String = STATUS_USER) : Unit(userName, userStatus)
class Admin(userName: String, userStatus: String = STATUS_ADMIN) : Unit(userName, userStatus) {
    fun deleteMessage() {
        println("$userStatus $userName удаляет сообщение")
    }

    fun deleteUser() {
        println("$userStatus $userName удаляет пользователя")
    }
}

fun main() {
    val user = User("Олег")
    val admin = Admin("Оксана")

    user.readMessage()
    user.sendMessage()
    admin.readMessage()
    admin.sendMessage()
    admin.deleteMessage()
    admin.deleteUser()
}