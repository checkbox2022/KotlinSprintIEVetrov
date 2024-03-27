package lesson22

fun main() {
    val alphaCentauri = GalacticGuide(
        "На встречу к приключениям",
        "Высадка на Альфе. Пройтись по барам",
        "05.05.2055",
        100
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val date = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("""
        Событие: $name
        Описание события: $description
        Дата: $date
        Расстояние: $distance
    """.trimIndent())
}

data class GalacticGuide(
    val spotEventName: String,
    val spotEventSetDescription: String,
    val date: String,
    val distance: Int
)