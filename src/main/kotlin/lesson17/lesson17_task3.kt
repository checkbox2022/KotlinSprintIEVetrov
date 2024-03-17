package lesson17

fun main() {
    val storage1 = CloudStorage("Storage1", 5, false)
    println(storage1.name)
    println(storage1.numberOfFiles)

    val storage2 = CloudStorage("Storage2", 7, true)
    println(storage2.name)
    println(storage2.numberOfFiles)
}


class CloudStorage(_name: String, _numberOfFiles: Int, var isSecret: Boolean) {
    val name = _name
        get() =
            if (isSecret) "Hidden folder"
            else field

    val numberOfFiles = _numberOfFiles
        get() =
            if (isSecret) 0
            else field
}