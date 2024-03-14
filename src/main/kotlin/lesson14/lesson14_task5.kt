package lesson14

fun main() {
    val chat = Chat()
    chat.addMessage("Pavel", "Hello")
    chat.addThreadMessage(0, "Max", "Hi")
    chat.addThreadMessage(0, "Den", "You are welcome")

    chat.addMessage("Sergey", "Hi guys!")
    chat.addThreadMessage(1, "Max", "Hi, man")
    chat.addThreadMessage(0, "Anny", "Hi, hi, hi ^^")
    chat.addThreadMessage(1, "Den", "Ho-ho")
    chat.addThreadMessage(1, "Pavel", "Hello, new!")

    chat.printChat()
}

class Chat {
    val listOfMessages = mutableListOf<Message>()
    var messageId: Int = 0

    fun addMessage(author: String, message: String) {
        listOfMessages.add(Message(messageId++, author, message))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, message: String) {
        listOfMessages.add(ChildMessage(parentMessageId, author, message))
    }

    fun printChat() {
        listOfMessages.forEach { it ->
            if (it !is ChildMessage) listOfMessages
                .groupBy { it.id }[it.id]
                ?.forEach { println("${it.author}: ${it.message}") }
        }
    }
}

open class Message(val id: Int, val author: String, val message: String)

class ChildMessage(id: Int, author: String, message: String) : Message(id, author, message)

