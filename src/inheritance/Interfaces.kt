package inheritance

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

interface CustomerRepository {
    var isEmpty: Boolean
        get() = true
        set(value) {
            isEmpty = value
        }

    fun getById(id: Int): Customer
    fun store(obj: Customer) {
        println("Storing")
    }

}

class CustomerRepo : CustomerRepository {
    override fun getById(id: Int): Customer {
        TODO("DO this")
    }

}

interface Interface1 {
    fun funA() {
        println("Fun A From Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A From Interface 2")
    }
}

class Class1And2 : Interface1, Interface2 {
    override fun funA() {
        super<Interface1>.funA()
        println("Class Imp")
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA()

}