package lesson2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5
    val average = (student1 + student2 + student3 + student4) / 4.toFloat()
    println(average)
}

/*
fun main() {
    println(addStudentsGrade())

}

fun addStudentsGrade(): Float {
    val studentsGrades = mutableListOf<Int>()
    println("Enter how many students are in the class:")
    val countOfStudents = readln().toInt()
    for (i in 1..countOfStudents) {
        println("Enter the grade of the student $i:")
        studentsGrades.add(readln().toInt())
    }
    return studentsGrades.sumOf { it } / countOfStudents.toFloat()
}*/
