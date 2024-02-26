package lesson2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5
    val average = (student1 + student2 + student3 + student4) / 4.toFloat()
    println(average)
}

/*fun lesson1.lesson1.lesson1.main() {
    println(addStudentsGrade())

}

fun addStudentsGrade(): Float {
    val studentsGrades = mutableListOf<Int>()
    println("Enter how many students are in the class:")
    val countOfStudents = readln().toInt()

    for (i in 1..countOfStudents) {
        println("Enter the grade of the student $i:")
        var grade = readln().toInt()
        if (grade !in 1..5) {
            println("the score can only contain values in the range from 1 to 5. Enter it again!")
            grade = readln().toInt()
        }

        studentsGrades.add(grade)
    }
    return studentsGrades.sumOf { it } / countOfStudents.toFloat()
}*/
