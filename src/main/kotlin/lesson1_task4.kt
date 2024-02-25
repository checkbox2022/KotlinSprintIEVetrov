fun main() {
    val length: Long = 40_868_600_000 // расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
    val age: Byte = 27 // возраст Гагарина на момент полета (целых лет);
    val partOfDay: Float = 0.075f // – какую часть дня Гагарин провел в космосе;
    val seconds: Short = 6480 // количество секунд которое Гагарин провел в космосе;
    val partOfYear: Double = 2.0547945205479453E-4 // какую часть года Гагарин провел в космосе;
    val apogee: Int = 327000 // апогей орбиты Гагарина в метрах.

    println("$length\n$age\n$partOfDay\n$seconds\n$partOfYear\n$apogee")
}