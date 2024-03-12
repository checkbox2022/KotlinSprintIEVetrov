package lesson13

fun main() {
    val phoneBookList = mutableListOf<Contact3>()
    val newContact3 = addContact()

    if (newContact3 != null) {
        phoneBookList.add(newContact3)

        phoneBookList.last().printContact()
    }
}

class Contact3(var name: String, var phoneNumber: Long, val companyTitle: String?) {
    fun printContact() {
        println(
            """
            Name: $name
            Number: $phoneNumber
            Company: $companyTitle
        """.trimIndent()
        )
    }
}

fun addContact(): Contact3? {

    print("Add name: ")
    val name = readln()

    print("Add number: ")
    val number: Long? = readln().toLongOrNull()

    if (number == null) {
        println("You have to add a number!")
        return null
    }

    print("Add company: ")
    var company: String? = readln()
    if (company == "") company = null

    return Contact3(name, number, company)
}

