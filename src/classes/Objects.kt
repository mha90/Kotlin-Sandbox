package classes

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)
    val localObject = object {
        val PI = 3.145
    }
    println(localObject .PI)

}