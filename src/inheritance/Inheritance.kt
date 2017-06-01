package inheritance

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
open class Person {
    open fun validate() {}
}

open class Customer : Person {
    override fun validate() {}

    constructor() : super()

}

class SpecialCustomer : Customer() {
    override fun validate() {
        super.validate()
    }
}

data class CustomerEntity(var id: Int) : Person() {}