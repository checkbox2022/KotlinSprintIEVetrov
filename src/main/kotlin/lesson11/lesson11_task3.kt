package lesson11

fun main() {
    val user1 = User3("Pavel", "")
    val room1 = Room("Flood")

    room1.addUser(user1)
    room1.changeStatus("Pavel", "mute")
    room1.showUserName(user1.avatar)

}

class Room(
    val roomName: String,
    val cover: Image = Image(),
) {
    val listOfUsers: MutableList<User3> = mutableListOf()

    fun addUser(user: User3) {
        listOfUsers.add(user)
    }

    fun changeStatus(nameUser: String, newStatus: String) {
        for (user in listOfUsers) {
            if (user.name == nameUser) user.userSpeakStatus = newStatus
        }
    }

    fun showUserName(avatar: Image) {
        for (user in listOfUsers) {
            if (user.avatar == avatar) println(user.name)
        }

    }

}

class User3(
    val name: String,
    var userSpeakStatus: String,
) {
    val avatar: Image = Image()
}

class Image() {}
