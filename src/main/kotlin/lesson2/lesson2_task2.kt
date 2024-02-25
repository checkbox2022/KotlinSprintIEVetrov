package lesson2

fun main() {
    val employeeSalary: Int = 30000
    val numberOfEmployees: Byte = 50
    val traineeSalary: Int = 20000
    val numberOfTrainee: Byte = 30
    val summaryEmployeeSalary = employeeSalary * numberOfEmployees
    val totalSalary = summaryEmployeeSalary + traineeSalary * numberOfTrainee
    val averageSalary = totalSalary / (numberOfEmployees + numberOfTrainee)
    println(summaryEmployeeSalary)
    println(totalSalary)
    println(averageSalary)
}