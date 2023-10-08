package lesson_19

/** Created by Platon2025 */

enum class Shell(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var shellType: String? = null) {
    fun loadShells(shellType: String?) {
        if (isShellAvailable(shellType)) {
            this.shellType = shellType
            println("\nТанк заряжен снарядами категории $shellType")
        } else {
            println("\nСнаряды категории $shellType недоступны\nДоступные для использования категории снарядов:")
            Shell.entries.forEach { println("${it.name} - сила выстрела ${it.power}") }
            println()
        }
    }

    private fun isShellAvailable(shellType: String?): Boolean {
        Shell.entries.forEach {
            if (it.name == shellType) return true
        }
        return false
    }

    fun shoot() {
        val shotPower = getShotPower(shellType)
        if (shotPower > 0) {
            println("Выстрел снарядом категории $shellType мощностью $shotPower")
        } else {
            println("\nЗарядите танк одним из доступных типов снарядов:")
            Shell.entries.forEach { println("${it.name} - сила выстрела ${it.power}") }
        }

    }

    private fun getShotPower(shellCode: String?): Int =
        try {
            if (shellCode != null) {
                Shell.valueOf(shellCode).power
            } else {
                0
            }
        } catch (e: IllegalArgumentException) {
            0
        }
}

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.loadShells("BLUE")
    tank.shoot()
    tank.loadShells("GREEN")
    tank.shoot()
    tank.shoot()
    tank.loadShells("RED")
    tank.shoot()
    tank.loadShells("PINK")
    tank.shoot()
}