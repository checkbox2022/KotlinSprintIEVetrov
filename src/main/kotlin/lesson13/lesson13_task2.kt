package lesson13

fun main() {
    val name1 = Contact("Pavel", 89997776655, null)

    name1.printContactData()
}

class Contact(var name: String, var phoneNumber: Long, var companyTitle: String?) {

    fun printContactData() {
        println("Name: $name\nPhone number: $phoneNumber\nCompany name: ${companyTitle ?: "Not specified"}")
    }
}