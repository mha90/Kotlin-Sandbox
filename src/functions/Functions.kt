package functions

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

fun hello(): Unit {
    println("Hello")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun undefinedParameters(vararg strings: String) {
    printStrings(*strings)
}

fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
    sum(1, 2, 3, 4)
    sum(1, 2, 3)
    sum(1, 2)
    sum(1, 2, w = 3)

    undefinedParameters("1")
    undefinedParameters("1", "2")
    undefinedParameters("1", "2", "3")
}

