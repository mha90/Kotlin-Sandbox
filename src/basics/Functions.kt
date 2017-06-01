package basics

//Concise
fun updateWeather(degree: Int) {
    val (description, color) = when {
        degree < 5 -> "Cold" to "Blue"
        degree < 22 -> "Mid" to "Orange"
        else -> "Hot" to "Red"
    }
}

data class Money(val amount: Int, val currency: String)

operator fun Money.minus(other: Money): Money {
    if (currency != other.currency) {
        throw IllegalArgumentException("Same Currency Transactions")
    }
    return copy(amount = amount - other.amount)
}

fun Money.add(other: Money): Money {
    if (currency != other.currency) {
        throw IllegalArgumentException("Same Currency Transactions")
    }
    return copy(amount = amount + other.amount)
}

fun main(args: Array<String>) {
    val a = Money(15, "USD")
    val b = Money(28, "USD")
    val c = a.add(b)
    val d = b - a
    println(c)
    println(d)
    val f = Money(555, "EGP")
    val g = Money(1555, "PHP")
    val monyes: List<Money> = listOf(a, b, c, d, f, g)
    println(monyes)
    val amounts: List<Int> = monyes.filter { it.currency == "USD" }.map { it.amount }
    println(amounts)

}


//                  Safety
//  The modern approach is to make NPE a compile-time error not run-time error
//  In scala one approach is optional types

