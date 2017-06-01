package tipsbyjake

import kotlin.LazyThreadSafetyMode.NONE

class NamePrinter(val firstName: String, val lastName: String) {
    val fullName: String by lazy(NONE) { "$firstName $lastName" }

    fun printName() {
        println(fullName)
    }
}

fun main(args: Array<String>) {
    val namePrinter = NamePrinter("Ahmed", "Mohamed")
    namePrinter.printName()
}