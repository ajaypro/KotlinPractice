package src.exercises

/**
 * @Author Ajay on 17-01-2019.
 */

fun skinType(color: String = "dusky") = "My skin color $color"

/**
 * Getting leap year from  Gregorian calendar
 */


data class Year(private val year: Int){
    val isLeap: Boolean
    get() = when{
        year.isDivisible(4) -> !year.isDivisible(100)|| year.isDivisible(400)
        else -> false

    }
    private fun Int.isDivisible(divisor: Int): Boolean = this % divisor == 0
}


fun main(args: Array<String>) {

    val skin = skinType("white")

    println(skin)

    val leapYear = Year(2019)

    if(leapYear.isLeap == true){
        println("This is leap year $leapYear")
    } else {
        println("This is not a leap year $leapYear")
    }

}