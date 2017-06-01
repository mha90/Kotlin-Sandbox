package tidbits

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
class NotNumberException(message: String) : Throwable(message) {
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotNumberException("This is not a number")
    }
}

fun main(args: Array<String>) {
    try {
        checkIsNumber("A")
    } catch (e: NotNumberException) {
        println(e.message)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    val buffer = BufferedReader(FileReader("Exceptions.kt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)

    } catch (e: Exception) {
        println("Exception ")
    } finally {
        println("Closing")
        buffer.close()
    }

    println(result)
}