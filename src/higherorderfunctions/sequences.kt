package higherorderfunctions

import kotlin.system.measureTimeMillis

/**
 * @Author Ajay on 09-10-2018.
 *
 * Using sequence here so that the operations such as filter, map & sum are applied on sequence object which
 * which makes only required calls (i.e lazy sequence) and reduces the exectuion time
 */

// Sum with lazy sequence

fun main(args:Array<String>){
    var lazySumResult = 0L
    var sumResult = 0L
    val list = (1..99999L).toList()
        val lazySum = measureTimeMillis {
            lazySumResult = list.asSequence() // lazy sequence object
                    .filter { it > 50 } // second this is executed applying only for 1000 elements
                    .map { it * 2 } // third this is executed applying only for 1000 items > 50
                    .take(100000) // first this is executed, also memory would be allocated only for these 1000 items
                    .sum()         // from the entire list, major advantage of lazy sequence
        }

  // Sum without lazy sequence
        val sum = measureTimeMillis {
            sumResult = list
                    .filter { it > 50 }
                    .map { it * 2 }
                    .take(100000)
                    .sum()
        }

    // Always use take() as first operator on collection as it reduces the execution time and memory allocation by
    // handling only those set of items

    println("lazy sequence $lazySum, Result: $lazySumResult")
    println("Non-lazy sequence $sum, Result: $sumResult")
}