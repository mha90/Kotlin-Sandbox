package tipsbyjake

fun runServer(): Nothing {
    while (true) {
        doNothing()
    }
}

fun doNothing() {
    Thread.sleep(2000L)
    TODO("Not Valid")
}

fun main(args: Array<String>) {
    runServer()
    println("Hello")
}
