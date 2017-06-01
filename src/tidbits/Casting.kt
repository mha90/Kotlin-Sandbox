package tidbits

import basics.containingFunction5

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */

open class Person {}

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacations ")
        }
    }
}

class Contractor : Person() {
    fun noPaidVacations() {
        println("Good Luck")
    }
}

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(24)
    }
    if (obj is Contractor) {
        obj.noPaidVacations()
    }
}

fun main(args: Array<String>) {

}