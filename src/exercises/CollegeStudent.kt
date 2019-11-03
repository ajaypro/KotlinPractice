package src.exercises

import kotlin.properties.Delegates

/**
 * @Author Ajay on 15-01-2019.
 */


fun main(args: Array<String>) {
    val lizzy = Student()
    with(lizzy){
        dressFormally()
        dressNormally()
        name = "ajay"

        println(name)
        println(homework)
    }

}