package lesson18

import kotlin.math.pow

fun main() {

    val cubeBox: Package = CubePackage(5.5)
    println(cubeBox.boxSurfaceArea())

    val rectangularBox: Package = RectangularPackage(1.5, 3.4, 2.2)
    println(rectangularBox.boxSurfaceArea())

}

abstract class Package() {
    abstract fun boxSurfaceArea(): Double
}

class CubePackage(private val side: Double) : Package() {
    override fun boxSurfaceArea() = side.pow(2) * 6

}

class RectangularPackage(private val side1: Double, private val side2: Double, private val side3: Double) : Package() {
    override fun boxSurfaceArea() = ((side1 * side2) + (side2 * side3) + (side3 * side1)) * 2

}
