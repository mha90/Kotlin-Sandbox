package tipsbyjake

fun main(args: Array<String>) {
    val foo = "Foo!"
    val bar = "Bar!"
    val baz = "Baz!"

    val s = """
                |$foo
                |$bar
                |$baz""".trimIndent()
    println(s)
}