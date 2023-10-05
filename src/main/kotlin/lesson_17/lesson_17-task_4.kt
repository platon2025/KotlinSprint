package lesson_17

/** Created by Platon2025 */

class Parcel(val trackingNumber: String, currentPoint: String) {
    var pointsCounter = 1
    var currentPoint = currentPoint
        set(value) {
            pointsCounter++
            field = value
        }
}

fun main() {
    val parcel = Parcel("RR111222333RU", "PostOffice NIZHNEVARTOVSK")
    println("Parcel ${parcel.trackingNumber} accepted at ${parcel.currentPoint}, counter = ${parcel.pointsCounter}")
    parcel.currentPoint = "TransitFacility SURGUT"
    println("Parcel ${parcel.trackingNumber} arrived at ${parcel.currentPoint}, counter = ${parcel.pointsCounter}")
    parcel.currentPoint = "TransitFacility TYUMEN"
    println("Parcel ${parcel.trackingNumber} arrived at ${parcel.currentPoint}, counter = ${parcel.pointsCounter}")
    parcel.currentPoint = "TransitFacility DOMODEDOVO"
    println("Parcel ${parcel.trackingNumber} arrived at ${parcel.currentPoint}, counter = ${parcel.pointsCounter}")
    parcel.currentPoint = "TransitOfficeOfExchange VNUKOVO"
    println("Parcel ${parcel.trackingNumber} arrived at ${parcel.currentPoint}, counter = ${parcel.pointsCounter}")
    parcel.currentPoint = "ExportedOfInternationalMail"
    println("Parcel ${parcel.trackingNumber} released by Customs and exported overseas, counter = ${parcel.pointsCounter}")
}
