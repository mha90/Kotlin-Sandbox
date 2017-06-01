package basics

//lambda
fun containingFunction3() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) return
    }
    println("Hello")
}

//anon function
fun containingFunction5() {
    val numbers = 1..100
    numbers.forEach(fun(element) {
        if (element % 5 == 0) return
    })
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction5()

}