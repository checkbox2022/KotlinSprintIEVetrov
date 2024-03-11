package lesson13

fun main() {
    val name1 = Contact2("Pavel", 89997776655)
}

class Contact2(var name: String, var phoneNumber: Long, var companyTitle: String? = null)