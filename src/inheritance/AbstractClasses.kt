package inheritance

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {
        println("Store ${status()}()")
    }
}

fun main(args: Array<String>) {
    val se = Employee()
    se.store()
}