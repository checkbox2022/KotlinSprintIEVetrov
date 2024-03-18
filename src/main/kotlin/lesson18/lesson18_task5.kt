package lesson18

fun main() {

    val dot: Figure = Dot("dot")

    val square: Figure = Square("square")

    val circle: Figure = Circle("circle")

    val screen = Screen()

    screen.drawFigure(1, 2, dot)
    screen.drawFigure(1, 2f, square)
    screen.drawFigure(1f, 2, circle)

}

class Screen {
    fun drawFigure(coordinateX: Int, coordinateY: Int, figure: Figure) {
        println("Figure ${figure.name} is placed at coordinates:\nX is $coordinateX\nY is $coordinateY")
    }

    fun drawFigure(coordinateX: Float, coordinateY: Float, figure: Figure) {
        println("Figure ${figure.name} is placed at coordinates:\nX is $coordinateX\nY is $coordinateY")
    }

    fun drawFigure(coordinateX: Float, coordinateY: Int, figure: Figure) {
        println("Figure ${figure.name} is placed at coordinates:\nX is $coordinateX\nY is $coordinateY")
    }

    fun drawFigure(coordinateX: Int, coordinateY: Float, figure: Figure) {
        println("Figure ${figure.name} is placed at coordinates:\nX is $coordinateX\nY is $coordinateY")
    }

}

abstract class Figure(val name: String)

class Dot(name: String) : Figure(name)

class Square(name: String) : Figure(name)

class Circle(name: String) : Figure(name)