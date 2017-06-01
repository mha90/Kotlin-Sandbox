package basics

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

fun main(args: Array<String>) {
    for (a in 1..100) {
        println(a)
    }

    val numbers = 1..100
    for (a in numbers) {
        println(a)
    }
    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    for (a in 100..1) {
        println(a)
    }
    val capitals = listOf("London", "Paris", "Madrid")
    for (capital in capitals) {
        println(capital)
    }

    var i = 100
    while (i > 0) {
        i--
    }
    var x = 10

    do {
        x--
    } while (x > 10)

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (j % i == 0) {
                continue
            }
        }
    }

}