package classes

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        return "{\"Id\": \"$id\", \"Name\":\"$name\", \"Email\":\"$email\"}"
    }
}

fun main(args: Array<String>) {

    val customerKotlin = CustomerKotlin(1, "Name", "Email@client.com")
    val customer = CustomerKotlin(1, "Name", "Email@client.com")
    val customer2 = customer.copy(name = "Ahmed")

    println(customer2)

    if (customer == customerKotlin) println("The same")
    else println("Not the same")

}