package interoperability

import classes.CustomerJava
import org.jetbrains.annotations.NotNull

/**
 * Created by Mohamed Hassan on 6/4/2017.
 * mhabulazm@gmail.com
 */
class PersonKotlin : PersonJava() {
}

class KotlinCustomerRepo : CustomerRepo {
    override @NotNull fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.name = "skldjasl"
    customer.print()
    val kr = KotlinCustomerRepo()

}