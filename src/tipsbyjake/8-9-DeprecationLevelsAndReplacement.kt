package tipsbyjake

import kotlin.DeprecationLevel.ERROR
import kotlin.DeprecationLevel.HIDDEN

//Levels Are: ERROR, WARNING, HIDDEN
//Replacements are as follows
@Deprecated("adasd", level = ERROR, replaceWith = ReplaceWith("strings.joinToString()"))
fun join(spe: String, strings: List<String>) {

}

fun main(args: Array<String>) {
//    join(", ", listOf("YOu", "Me"))
    listOf("YOu", "Me").joinToString(", ")

}