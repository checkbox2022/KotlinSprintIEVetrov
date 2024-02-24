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
        val saillingPermit =
        if ((isWorkShip == true
                    && numberOfMembers in 55..70
                    && stockOfProvisions > 50
                    && isFavorableWeather == true || false)
            || (isWorkShip == true || false // альтернативное условие, если я правильно понял, в отношении наличия повреждений,
                    // или их отсутствия - не являеется своего рода долженствованием, а значит можно отправится в плавание,
                    // как с наличием повреждений, так и без, т.е. и в полностью исправном состоянии в т.ч.
                    && numberOfMembers == 70
                    && stockOfProvisions >= 50
                    && isFavorableWeather == true)) true
        else false

    println(saillingPermit)

}