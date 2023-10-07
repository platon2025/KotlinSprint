package lesson_17

/** Created by Platon2025 */

class User(login: String, password: String) {
    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён на $value")
        }
}

fun main() {
    val user = User("whiterabbit", "qwerty")
    println("user: ${user.login}, password: ${user.password}\n")
    user.login = "blackninja"
    println("user: ${user.login}, password: ${user.password}\n")
    user.password = "1234"
    println("user: ${user.login}, password: ${user.password}")
}