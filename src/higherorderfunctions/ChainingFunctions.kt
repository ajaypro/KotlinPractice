package higherorderfunctions

/**
 * @Author Ajay on 09-10-2018.
 */

fun main(args:Array<String>){
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    // clean the data first

      val cleaned  = data.flatMap { it.value }
              .filter { it > 0 }
              .toIntArray()

    println(cleaned.joinToString())

    val average = cleaned.average()

    println(average)

    // Lazy sequences of kotlin  = streams in java8



}