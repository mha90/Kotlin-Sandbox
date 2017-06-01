package basics

fun invariant() {
    val elements: MutableList<Any>
    val strings: MutableList<String> = mutableListOf("A", "B", "C")
//    elements = strings
//    can't be assigned because they are mutable lists

}

fun covariant() {
    val elements: List<Any>
    val strings: List<String> = listOf("A", "B", "C")

    elements = strings
}