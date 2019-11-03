package higherorderfunctions

/**
 * @Author Ajay on 09-10-2018.
 */

fun main(args:Array<String>){

    val cars = listOf<String>("ford", "bentely", "hyundai", "frerrai", "mclaraen")
    val bigTyres = listOf<Boolean>(false, true, false, true, true)

    val zipping: List<Pair<String, Boolean>> = cars.zip(bigTyres)
    println(zipping)

    val mapping = cars.map { cars.zip(bigTyres) }
    println(mapping)
}