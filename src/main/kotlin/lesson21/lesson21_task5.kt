package lesson21

fun main() {

    val player = Player6()

    println(player.mapOfSkills.maxCategory())

}

class Player6 {

    val mapOfSkills = mapOf<String, Int>(
        "Speed" to 15,
        "Strength" to 20,
        "Damage" to 10,
        "Lifting" to 20
    )

}

fun Map<String, Int>.maxCategory() = maxBy { it.value }.toString().split("=").first()
