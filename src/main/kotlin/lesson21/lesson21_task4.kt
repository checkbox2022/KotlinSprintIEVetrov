package lesson21

import java.io.File

fun main() {

    val wordsFile = File("words.txt")
    wordsFile.createNewFile()

    wordsFile.addNewLineToTop("zero")

    println(wordsFile.readLines())

}

fun File.addNewLineToTop(newText: String) {
    val bufferWordsFile = readLines()
    delete()

    appendText("$newText\n")

    bufferWordsFile.forEach {
        appendText("${it}\n")
    }

}
