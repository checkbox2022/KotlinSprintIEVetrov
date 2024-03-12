package lesson13

fun main() {
    val phoneBookList = mutableListOf<Contact3>()

    addContact(phoneBookList)

    if (phoneBookList.size > 0) phoneBookList.last().printContact()
}

class Contact3(var name: String, var phoneNumber: Long, var companyTitle: String?){
    fun printContact(){
        println("""
            Name: $name
            Number: $phoneNumber
            Company: $companyTitle
        """.trimIndent())
    }
}

fun addContact(list: MutableList<Contact3>): List<Contact3>{

    print("Add name: ")
    val name = readln()

    print("Add number: ")
    val number: Long? = readln().toLongOrNull()

    if (number == null){
        println("You have to add a number!")
        return list
    }
    else list.add(Contact3(name, number, null))

    print("Add company: ")
    val company = readln()
    if (company != "") list.last().companyTitle = company

    return list
}

