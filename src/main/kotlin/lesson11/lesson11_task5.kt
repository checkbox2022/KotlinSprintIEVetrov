package lesson11

fun main() {
    val forum = Forum()
    val member1 = forum.createNewMember("Pavel")
    val member2 = forum.createNewMember("Den")

    forum.createNewMessage(member1.memberID)
    forum.createNewMessage(member2.memberID)
    forum.createNewMessage(member1.memberID)
    forum.createNewMessage(member2.memberID)

    forum.printThread()
}

class Forum {
    val listOfMembers = mutableListOf<Member>()
    val listOfMessages = mutableListOf<Message>()
    var id = 0

    fun createNewMember(name: String): Member {
        listOfMembers.add(Member.newMember(id++, name))
        return listOfMembers.last()
    }

    fun createNewMessage(id: Int) {
        for (member in listOfMembers) {
            if (id == member.memberID) {
                print("Leave a message: ")
                val message = readln()
                listOfMessages.add(Message.newMessage(id, message))
            }
        }
    }

    fun printThread() {
        for (messageElement in listOfMessages) {
            val id = messageElement.authorID
            val message = messageElement.messageText
            var name = ""

            for (memberElement in listOfMembers) {
                if (memberElement.memberID == id) name = memberElement.memberName
            }
            println("$name: $message")
        }
    }
}

class Member(val memberID: Int, val memberName: String) {
    companion object {
        fun newMember(id: Int, name: String) = Member(id, name)
    }
}

class Message(val authorID: Int, val messageText: String) {
    companion object {
        fun newMessage(id: Int, text: String) = Message(id, text)
    }
}
