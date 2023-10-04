package lesson_16

/** Created by Platon2025 */

class User(val login: String, private val password: String) {
    fun verifyUser(login: String, password: String): Boolean = login == this.login && password == this.password
}

fun main() {
    val user = User("oleg", "qwerty")
    val input1 = listOf("oleg", "123456")
    val input2 = listOf("oleg", "qwerty")
    println("Результаты авторизации пользователя\n")
    println(
        "Введено: Логин ${input1[0]}, Пароль ${input1[1]}\nРезультат: ${
            user.verifyUser(
                input1[0],
                input1[1]
            )
        }\n"
    )
    println(
        "Введено: Логин ${input2[0]}, Пароль ${input2[1]}\nРезультат: ${
            user.verifyUser(
                input2[0],
                input2[1]
            )
        }\n"
    )
}