package lesson13

import java.lang.Exception

fun main() {
    print("Enter name: ")
    val name = readln()

    print("Enter number: ")
    val number = try {
        readln().toLong()
    } catch (e: Exception) {
        println(e.message)
    }
    if (number !is Long)
        throw Exception("You can only use numbers in your password!")

    print("Enter company: ")
    val company: String = readln()

    val newContact = Contact4(name, number, company)
}

class Contact4(var name: String, var phoneNumber: Long, var companyTitle: String?)