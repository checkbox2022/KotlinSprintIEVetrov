package lesson19

fun main() {
    val hat = Product("Hat", 123, Category.CLOTHES)
    hat.showInfo()

    val pan = Product("Pan", 321, Category.STATIONERY)
    pan.showInfo()

    val apple = Product("Apple", 999, Category.OTHERS)
    apple.showInfo()

}

enum class Category {
    CLOTHES {
        override fun returnCategory(): String {
            return CLOTHES.name
        }
    },
    STATIONERY {
        override fun returnCategory(): String {
            return STATIONERY.name
        }
    },
    OTHERS {
        override fun returnCategory(): String {
            return OTHERS.name
        }
    };

    abstract fun returnCategory(): String

}

class Product(val name: String, val id: Int, val category: Category) {
    fun showInfo() {
        println(
            """
            name: $name
            id: $id
            category: ${category.returnCategory()} 
        """.trimIndent()
        )
    }
}