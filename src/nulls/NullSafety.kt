package nulls

import classes.CustomerJava

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

class Service {
    fun eval() {

    }
}

class ServiceProvider {
    fun createService(): Service? {
        TODO()
    }
}

fun main(args: Array<String>) {
    val message = "Message"
    var nullMessage: String? = null
    val nullMessag = null

//    if (nullMessage != null)
    nullMessage = "some message "
    println(nullMessage.length)

    val customerJava = CustomerJava()

//    println(customerJava.name.length)

    val sp = ServiceProvider()
    sp.createService()?.eval()

}