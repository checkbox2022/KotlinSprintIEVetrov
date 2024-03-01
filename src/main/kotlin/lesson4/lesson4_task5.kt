package lesson4

const val MIN_MEMBERS = 55
const val MAX_MEMBERS = 70
const val RECOMMEND_PROVISION = 50


fun main() {
    println("Сообщите о наличии/отсутствии повреждений корабля. Введите \"true\" при отсутсвии повреждений или \"fasle\" при наличии:")
    val isWorkShip = readln().toBoolean()

    println("Сообщите о текущих погодных условиях. Благоприятные - \"true\", неблагоприятные - \"fasle\":")
    val isFavorableWeather = readln().toBoolean()

    println("Укажите кол-во членов экипажа:")
    val numberOfMembers = readln().toInt()

    println("Укажите кол-во доступной продукции на корабле:")
    val stockOfProvisions = readln().toInt()

    val sailingPermit =
        (isWorkShip && numberOfMembers in MIN_MEMBERS..MAX_MEMBERS && stockOfProvisions > RECOMMEND_PROVISION) || (numberOfMembers == MAX_MEMBERS && stockOfProvisions >= RECOMMEND_PROVISION && isFavorableWeather)

    println(sailingPermit)
}