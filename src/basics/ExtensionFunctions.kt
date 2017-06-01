package basics

import java.util.*

/**
 * Created by Mohamed Hassan on 5/30/2017.
 */
fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun Date.isTuesday() = day == 2


infix fun String.isTheSameAs(value: String) = this == value

fun main(args: Array<String>) {
    "Hello" isTheSameAs "Hello"

    println("This is simple test for extension functions ")
}