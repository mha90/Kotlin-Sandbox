package basics

fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
    val newList = ArrayList<T>()
    this.filterTo(newList) { predicate(it) }
    return newList
}

fun main(args: Array<String>) {
    val names = listOf("Ahmed", "Ali", "Saad", "Mohamed", "Aly")
    val aNames = names.filter { it.startsWith("A") }
    println(aNames)

    println(highOrderFunctions(14, 15, ::add))
    println(highOrderFunctionSingle(16, ::plusOne))
    println(highOrderFunctionSingle(16, { it + 2 }))
    println(highOrderFunctionSingle(16, { x -> x + 3 }))
    println(highOrderFunctionSingle(16) { it + 5 })

    val notEmpty: (String) -> Boolean = { !it.isEmpty() }

}

fun add(x: Int, y: Int) = x + y
fun plusOne(x: Int) = x + 1

fun highOrderFunctions(x: Int, y: Int, func: (Int, Int) -> Int): Int {
    return func(x, y)
}

fun highOrderFunctionSingle(x: Int, func: (Int) -> Int): Int {
    return func(x)
}

