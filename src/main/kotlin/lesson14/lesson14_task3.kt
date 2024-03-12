package lesson14

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val listOfFigures = mutableListOf<Figure>()
    listOfFigures.addAll(
        0, listOf(
            Circle("white", 5.5),
            Circle("black", 3.3),
            Rectangle("yellow", 3.4, 2.1),
            Rectangle("white", 3.7, 2.8),
            Circle("gray", 6.1),
            Circle("black", 3.7),
            Rectangle("white", 7.2, 2.9),
            Rectangle("yellow", 8.4, 5.1),
        )
    )

    val sumPerimeterBlack = listOfFigures.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    println(sumPerimeterBlack)

    val sumAreaWhite = listOfFigures.filter { it.color == "white" }.sumOf { it.calculateArea() }
    println(sumAreaWhite)
}

abstract class Figure(val color: String) {
    open fun calculateArea(): Double = 0.0
    open fun calculatePerimeter(): Double = 0.0
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radius.pow(2)
    override fun calculatePerimeter(): Double = 2 * PI * radius

}

class Rectangle(color: String, val longSide: Double, val shortSide: Double) : Figure(color) {
    override fun calculateArea(): Double = longSide * shortSide
    override fun calculatePerimeter(): Double = 2 * (longSide + shortSide)
}