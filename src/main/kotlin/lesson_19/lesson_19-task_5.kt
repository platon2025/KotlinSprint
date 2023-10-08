package lesson_19

/** Created by Platon2025 */
fun main() {
    val catalogue = Catalogue()
    val numPersons = 5
    println(
        "Для добавления человека в картотеку введите его имя и пол\nДоступные значения пола: ${
            catalogue.getAcceptableGenders().joinToString()
        }"
    )

    do {
        catalogue.addPersonToCatalogue()
    } while (catalogue.persons.size < numPersons)
    catalogue.printPersonsList()
}

class Catalogue {
    var persons = mutableListOf<Person>()
    private fun registPerson(person: Person) {
        this.persons.add(person)
        println("${person.name} добавлен${person.gender.postfix} в картотеку\n")
    }

    fun addPersonToCatalogue() {
        println("Заполняем карточку №${persons.size + 1}. Введите имя:")
        val name = readln()
        println("Введте пол:")
        var gender: Gender
        do {
            gender = getGenderByAbbr(readln())
            if (!gender.isAcceptable) {
                println(
                    "Некорректный формат ввода пола! Попробуйте ещё раз.\nДоступные значения пола: ${getAcceptableGenders().joinToString()}. Введите пол:"
                )
            } else {
                registPerson(Person(name, gender))
                return
            }
        } while (true)

    }

    fun printPersonsList() {
        persons.forEach {
            println("Имя: ${it.name}, ${it.gender.full}")
        }
    }

    private fun getGenderByAbbr(abbr: String): Gender {
        Gender.entries.forEach {
            if (it.abbr.equals(abbr, true)) {
                return it
            }
        }
        return Gender.EXOTIC
    }

    fun getAcceptableGenders(): MutableList<String> {
        val gendersList: MutableList<String> = mutableListOf()
        Gender.entries.forEach {
            if (it.isAcceptable) {
                gendersList.add(it.abbr)
            }
        }
        return gendersList
    }
}

class Person(val name: String, val gender: Gender)

enum class Gender(val abbr: String, val full: String, val postfix: String, val isAcceptable: Boolean) {
    MALE("М", "пол Мужской", "", true),
    FEMALE("Ж", "пол Женский", "а", true),
    EXOTIC("", "", "", false)
}
