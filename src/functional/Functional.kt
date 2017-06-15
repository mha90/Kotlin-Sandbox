package functional

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

//High order functions
fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun sum(x: Int, y: Int) = x + y

//Variable number of operations/functions
fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOp(op: (Int) -> Int) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {
    println("Unary Operation ${op(x)}")
}

fun main(args: Array<String>) {
    operation(1, 3, ::sum)
    operation(1, 3, { x, y ->
        println("Lambdas add four ")
        x + y + 4
    })

    val sumLamda: (Int, Int) -> Int = { x, y -> x + y }
    operation(1, 7, sumLamda)

    val unaryLamda: (Int) -> Int = { x -> x + 5 }
    unaryOperation(4, { it + 5 })
    unaryOperation(5, unaryLamda)
    unaryOperation(6, { x -> x + 5 })
    unaryOperation(7) { x -> x + 15 }

    unaryOp {
        it * it
    }

    unaryOperation(3, fun(x: Int): Int { return x * x })

}