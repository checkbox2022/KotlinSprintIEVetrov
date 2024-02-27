package lesson4

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
        (isWorkShip && numberOfMembers in 55..70 && stockOfProvisions > 50 && isFavorableWeather) || (!isWorkShip && numberOfMembers == 70 && stockOfProvisions >= 50 && isFavorableWeather)

    println(sailingPermit)
}