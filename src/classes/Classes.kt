package classes

import java.util.*

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
class Customer(var id: Int, var name: String = "", val yearOfBirth: Int = 1990) {
    init {
        name = name.toUpperCase()
    }

    constructor(name: String, yearOfBirth: Int) : this(0, name, yearOfBirth)

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
        set(value) {
            if (!value.startsWith("SN"))
                throw IllegalArgumentException("SSN Should Start With SN")
        }

    fun customerAsString(): String {
        return "Id: $id , Name:$name , yearOfBirth: $yearOfBirth"
    }
}

fun main(args: Array<String>) {

    val customer = Customer(10, "Name")
    val secondCustomer = Customer(15)
    val thirdCustomer = Customer(name = "Ahmed", yearOfBirth = 1980)

//    customer.id = 10
//    customer.name = "Mohand"
    println(customer.name)
    println(secondCustomer.name)
    println(thirdCustomer.name)
    println(thirdCustomer.customerAsString())
//    thirdCustomer.ssn = "1234"

}