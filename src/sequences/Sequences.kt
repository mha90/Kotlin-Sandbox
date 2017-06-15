package sequences

import kotlin.coroutines.experimental.buildSequence

/**
 * Created by Mohamed Hassan on 6/4/2017.
 * mhabulazm@gmail.com
 */
fun main(args: Array<String>) {
    val seq = buildSequence {
        for (i in 1..5) {
            yield(i * i)
        }
        yield(26..28)
    }
    println(seq)
}