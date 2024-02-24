package lesson3

fun main() {
    var pointOfEntry = "E2"
    var pointOfEnd = "E4"
    var moveNumber = "1"
    var move = "$pointOfEntry-$pointOfEnd:$moveNumber"
    println(move)
    pointOfEntry = "D2"
    pointOfEnd = pointOfEntry.map { if (it.isDigit()) it + 1 else it }.joinToString("")
    /*
     не очень понятна данная часть задания: "Определить, какое значение будет в переменной "куда" для фигуры,
     стоящей на D2 и продвинувшейся на одну клетку вперед." - Определить нужно было в уме или написать код
     увеличения значения из D2 в D3
    */
    // println(pointOfEnd)
    move = "$pointOfEntry-$pointOfEnd:${(moveNumber.toInt() + 1)}"
    println(move)
}