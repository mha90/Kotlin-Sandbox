package tuples

//Tuples are deprecated use
//Pair and Triple

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Spain", "Madrid", 32322398)
}

fun main(args: Array<String>) {
    val pair = capitalAndPopulation("")
    println(pair)
    val (capitol, population) = capitalAndPopulation("")
    println(capitol)
    println(population)

    val triple = countryInformation("")
    println(triple)

}