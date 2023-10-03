package lesson_15

/** Created by Platon2025 */

const val MAX_PASSENGERS_CAR = 3
const val MAX_PASSENGERS_TRUCK = 1
const val MAX_CARGO_TRUCK = 2

interface PassengerTransport {
    val name: String
    val maxPassengers: Int
    fun go(passengers: Int): Map<String, Int>
}

interface CargoTransport {
    val name: String
    val maxPassengers: Int
    val maxCargo: Int
    fun go(passengers: Int, cargo: Int): Map<String, Int>

}

class Car(
    override val name: String,
    override val maxPassengers: Int = MAX_PASSENGERS_CAR,
) : PassengerTransport {
    override fun go(passengers: Int): Map<String, Int> =
        if (passengers <= maxPassengers) {
            println("$name перевез $passengers пассажиров.")
            mapOf(Pair("passengers", passengers))
        } else {
            println("$name не смог взять на борт $passengers пассажиров. Поездка не состоялась.")
            mapOf(Pair("passengers", 0))
        }
}

class Truck(
    override val name: String,
    override val maxPassengers: Int = MAX_PASSENGERS_TRUCK,
    override val maxCargo: Int = MAX_CARGO_TRUCK,
) : CargoTransport {
    override fun go(passengers: Int, cargo: Int): Map<String, Int> =
        if (passengers <= maxPassengers && cargo <= maxCargo) {
            println("$name перевез $passengers пассажиров и $cargo тонн груза.")
            mapOf(Pair("passengers", passengers), Pair("cargo", cargo))
        } else {
            println("$name не смог взять на борт $passengers пассажиров и $cargo тонн груза. Поездка не состоялась.")
            mapOf(Pair("passengers", 0), Pair("cargo", 0))
        }
}

fun main() {
    val passengersPlan = 6
    val cargoPlan = 2
    var transported: Map<String, Int> = mutableMapOf(Pair("passengers", 0), Pair("cargo", 0))

    transported = countTransported(
        trip = Car("Красный кабриолет").go(2),
        transportedBefore = transported,
        passengersPlan = passengersPlan,
        cargoPlan = cargoPlan,
    )
    countTransported(Truck("Зеленый фургон").go(2, 2), transported, passengersPlan, cargoPlan).also { transported = it }
    countTransported(Car("Чёрный бумер").go(3), transported, passengersPlan, cargoPlan).also { transported = it }
    countTransported(Truck("Желтый фургон").go(1, 2), transported, passengersPlan, cargoPlan)

}

fun countTransported(
    trip: Map<String, Int>,
    transportedBefore: Map<String, Int>,
    passengersPlan: Int,
    cargoPlan: Int
): Map<String, Int> {

    val totalTransportedPassengers = (transportedBefore["passengers"] ?: 0) + (trip["passengers"] ?: 0)
    val totalTransportedCargo = (transportedBefore["cargo"] ?: 0) + (trip["cargo"] ?: 0)

    if (totalTransportedPassengers >= passengersPlan && totalTransportedCargo >= cargoPlan) println("Jobs done!")
    else println("Осталось перевезти ${passengersPlan - totalTransportedPassengers} пассажиров и ${cargoPlan - totalTransportedCargo} тонн груза\n")

    return mapOf(Pair("passengers", totalTransportedPassengers), Pair("cargo", totalTransportedCargo))
}