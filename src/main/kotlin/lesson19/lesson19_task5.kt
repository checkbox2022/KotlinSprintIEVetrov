package lesson19

import java.util.*

const val PERSON_LIMIT = 5

fun main() {

    val listCardIndex = mutableListOf<Person>()
    println("Complete the list of 5 people. Provide each person's name in string format and gender in the format male or female (male/female) in any case\n")

    for (person in 1..PERSON_LIMIT) {
        print("Enter name of $person person: ")
        val name = readln()

        listCardIndex.add(
            Person(
                name,
                enterGender()
            )
        )
    }

    listCardIndex.forEachIndexed { index, person ->
        println("${index + 1}. ${person.name} - ${person.gender}")
    }

    println(listCardIndex) // если вариант вывода списка выше не подходит, сделал класс Person() дата классом

}

data class Person(val name: String, val gender: Gender)

enum class Gender {
    MALE,
    FEMALE
}

fun enterGender(): Gender {

    print("Enter gender: ")

    return when (readln().uppercase(Locale.getDefault())) {
        "MALE" -> Gender.MALE
        "FEMALE" -> Gender.FEMALE
        else -> {
            println("ERROR!")
            enterGender()
        }

    }

}