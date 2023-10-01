package lesson_15

/** Created by Platon2025 */

const val SERVER_IP = "192.193.194.195"

abstract class Message(val serverIP: String = SERVER_IP) {
    fun connectToServer() {
        println("Connection to the server $serverIP is established")
    }

    abstract fun sendMessage()

}

class TemperatureMessage(serverIP: String, val temperature: Int) : Message(serverIP) {

    override fun sendMessage() {
        println("Current temperature is $temperature degrees")
    }
}

class PrecipitationMessage(serverIP: String, val precipitationProbability: Int) : Message(serverIP) {

    override fun sendMessage() {
        println("Probability of precipitation is $precipitationProbability%")
    }

}

fun main() {
    val messageTemperature = TemperatureMessage(SERVER_IP, 28)
    val messagePrecipitation = PrecipitationMessage(SERVER_IP, 40)

    messageTemperature.connectToServer()
    messageTemperature.sendMessage()
    messagePrecipitation.connectToServer()
    messagePrecipitation.sendMessage()

}