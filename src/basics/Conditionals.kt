package basics

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
fun main(args: Array<String>) {
    var myString = "Not Empty"

//  if as an expression
    val result = if (myString != "") {
        "Not Empty$$"
    } else {
        "Empty$$"
    }
//    println(result)

// When similar to switch
    when (result) {
        is String -> {
            println("String")
            println("Second Line")
        }
        "value" -> println("Value")
    }

//when as expression
    val whenValue = when (result) {
        is String -> {
            println("String")
            "When Second Line"
        }
        "value" -> {
            println("When Value")
            "When Value Second line"
        }
        else -> {
            println("Else ---")
            "It Came to This?"
        }
    }
    println(whenValue)

}