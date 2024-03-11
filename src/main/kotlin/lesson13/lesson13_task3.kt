package lesson13

fun main() {
    val listOfContacts = listOf(
        Contact1("Pavel", 12345, "null"),
        Contact1("Anny", 25122, "Agro"),
        Contact1("Sasha", 31245, null),
        Contact1("Den", 73467, null),
        Contact1("Sergey", 45233, "Skill")
    )

    listOfContacts.mapNotNull { it.companyTitle }.also { println(it) }
}

class Contact1(var name: String, var phoneNumber: Long, var companyTitle: String?)