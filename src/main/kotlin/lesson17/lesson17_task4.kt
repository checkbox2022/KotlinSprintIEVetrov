package lesson17

fun main() {
    val package1 = Package(15, "MSC")
    println(package1.count)
    package1.location = "SPB"
    println(package1.count)
    package1.location = "EKB"
    println(package1.count)
    package1.location = "DV"
    println(package1.count)
}

class Package(val numberPackage: Int, _location: String) {
    var count = 0
    var location = _location
        set(newLocation) {
            field = newLocation
            count++
        }
}