package lesson17

class Quiz(val _question: String, val _answer: String) {
    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}
