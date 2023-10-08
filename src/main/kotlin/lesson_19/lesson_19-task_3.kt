package lesson_19

/** Created by Platon2025 */

class SpaceShip {
    fun takeOff() {
        TODO()
    }

    fun landing() {
        println("Звездолёт припаркован")
    }

    fun shoot() {
        println("Огонь по выбранной цели")
        //TODO : прописать логику с учетом выбранного оружия
    }
}

fun main() {
    val spaceShip = SpaceShip()

//    spaceShip.takeOff()
    spaceShip.shoot()
    spaceShip.landing()

}