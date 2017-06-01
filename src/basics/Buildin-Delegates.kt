package basics

import kotlin.properties.Delegates

class Veto {
    var value: String by Delegates.vetoable("String") { prop, old, new -> new.startsWith("S") }
}

fun main(args: Array<String>) {
    val veto = Veto()
    println(veto.value)
    veto.value = "Change"
    println(veto.value)
    veto.value = "Strange"
    println(veto.value)

}