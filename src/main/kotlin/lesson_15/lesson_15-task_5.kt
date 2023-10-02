package lesson_15

/** Created by Platon2025 */

const val MAX_PASSENGERS_CAR = 3
const val MAX_PASSENGERS_TRUCK = 1
const val MAX_TONNAGE_TRUCK = 2

interface PassengerTransport {
    val name: String
    val maxPassengers: Int
    fun go(passengers: Int): Map<String, Int> =
        if (passengers <= maxPassengers) {
            println("$name перевез $passengers пассажиров.")
            mapOf(Pair("passengers", passengers))
        } else {
            println("$name не смог взять на борт $passengers пассажиров. Поездка не состоялась.")
            mapOf(Pair("passengers", 0))
        }

}

interface CargoTransport {
    val name: String
    val maxPassengers: Int
    val maxTonnage: Int
    fun go(passengers: Int, tonnage: Int): Map<String, Int> =
        if (passengers <= maxPassengers && tonnage <= maxTonnage) {
            println("$name перевез $passengers пассажиров и $tonnage тонн груза.")
            mapOf(Pair("passengers", passengers), Pair("tonnage", tonnage))
        } else {
            println("$name не смог взять на борт $passengers пассажиров и $tonnage тонн груза. Поездка не состоялась.")
            mapOf(Pair("passengers", 0), Pair("tonnage", 0))
        }

}

class Car(
    override val name: String,
    override val maxPassengers: Int = MAX_PASSENGERS_CAR
) : PassengerTransport

class Truck(
    override val name: String,
    override val maxPassengers: Int = MAX_PASSENGERS_TRUCK,
    override val maxTonnage: Int = MAX_TONNAGE_TRUCK
) : CargoTransport

fun main() {
    val task = mapOf(Pair("passengers", 6), Pair("tonnage", 2))
    var completed = mapOf(Pair("passengers", 0), Pair("tonnage", 0))

    println("Нужно перевезти ${task["passengers"]} человек и ${task["tonnage"]} тонн груза\n")

    completed = countCompletion(completed, Car("Красный кабриолет").go(2))
    printTripResult(task, completed)
    completed = countCompletion(completed, Truck("Зеленый фургон").go(2, 2))
    printTripResult(task, completed)
    completed = countCompletion(completed, Car("Чёрный бумер").go(3))
    printTripResult(task, completed)
    completed = countCompletion(completed, Truck("Желтый фургон").go(1, 2))
    printTripResult(task, completed)
}

fun printTripResult(task: Map<String, Int>, completed: Map<String, Int>) {
    println(
        "Осталось перевезти ${task["passengers"]?.minus(completed["passengers"]!!)} человек и ${
            task["tonnage"]?.minus(
                completed["tonnage"]!!
            )
        } тонн груза.\n"
    )
}

fun countCompletion(completedBefore: Map<String, Int>, completed: Map<String, Int>): Map<String, Int> {
    val totalCompleted = mutableMapOf(Pair("passengers", 0), Pair("tonnage", 0))
    if (completedBefore.isNotEmpty()) {
        if (completedBefore["passengers"] != null) totalCompleted["passengers"] = completedBefore["passengers"]!!
        if (completedBefore["tonnage"] != null) totalCompleted["tonnage"] = completedBefore["tonnage"]!!
    }
    if (completed["passengers"] != null && completed["passengers"] != 0) totalCompleted["passengers"] =
        totalCompleted["passengers"]!! + completed["passengers"]!!
    if (completed["tonnage"] != null && completed["tonnage"] != 0) totalCompleted["tonnage"] =
        totalCompleted["tonnage"]!! + completed["tonnage"]!!

    return totalCompleted
}