package src.nullhandling

import java.lang.IllegalArgumentException

/**
 * @Author Ajay on 13-01-2019.
 */

//(1) Elvis operator to throw exception if null
fun requireNotNull(any: Any?): Any = throw IllegalArgumentException("$any must not be null")

fun main(args: Array<String>){

    var name =""

    while(name == ""){
        println("$name")

        name = readLine() ?: ""
    }

    println("Hello $name")
}