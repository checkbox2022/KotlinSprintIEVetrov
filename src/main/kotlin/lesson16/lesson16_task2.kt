package lesson16

import kotlin.math.pow

fun main() {
    val circle = Circle(5.5)

    println(circle.getArea())
    println(circle.getPerimeter())
}

class Circle(private val radius: Double) {
    private val PI = 3.14
    fun getArea() = PI * radius.pow(2)
    fun getPerimeter() = 2 * PI * radius
}