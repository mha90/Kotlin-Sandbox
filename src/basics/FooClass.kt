package basics

class FooClass {
    operator fun invoke(name: String) {
        println("Hello $name")
    }

}
fun main(args: Array<String>) {
    val foo = FooClass()
    foo.invoke("Ahmed")
}