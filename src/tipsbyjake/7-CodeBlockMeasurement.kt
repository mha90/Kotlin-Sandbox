package tipsbyjake

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val helloTookMS = measureTimeMillis {
        println("Hello World MS!")
    }
    val helloTookNS = measureNanoTime {
        println("Hello World NS!")
    }
    println("Saying Hello took ${helloTookMS}ms")
    println("Saying Hello took ${helloTookNS}ns")

}