package higherorderfunctions

/**
 * @Author Ajay on 10-10-2018.
 */

fun main(args:Array<String>){

    val primeAfter2 = generateSequence(3) { it + 2 } // Generates numbers like 3, 5,7,9 ..

    // Generates prime starting from 2
    val prime = generateSequence( 2 to primeAfter2) {
         val p = it.second.first() // it is 2,
        // it.second is the sequence after 2,
        // it.second.first() - will be 3 i.e next sequence of prime number after 2

        val primesAfterP = it.second.filter { it % p != 0 }
        // it.second is sequence of prime after 2
        // it.second.filter{it % p != 0} - get rid of numbers that are divisble by p
        // e.g if p is 3 multiples of 3 - 9, 15, 18... will be eliminated


        // Returned next element in sequence, used infix function
         p to primesAfterP


    }.map { it.first }

    println(prime.takeWhile { it < 100 }.toList())
    println(prime.take(10).toList())


}