package tipsbyjake

fun main(args: Array<String>) {
    val b: Boolean = false

//  1-  Throws illegal argument exception
//    require(value = b)
//    require(b, lazyMessage = { " Value can't be false! " })

//  2- Throws illegal state exception
//    check(b)
//    check(b, lazyMessage = { " Value can't be false! " })

//  3- Checks if value is null
//    Throws illegal state exception
//    checkNotNull(b)
//    checkNotNull(b, lazyMessage = { "Value Can't be null" })

//  4-
//    Throws illegal argument exception
    requireNotNull(b)
    requireNotNull<Boolean>(b, lazyMessage = { "Value can't be null" })
}
