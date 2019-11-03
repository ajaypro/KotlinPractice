package higherorderfunctions

/**
 * @Author Ajay on 09-10-2018.
 */

fun main(args:Array<String>){

    val list = generateSequence(0){
        println("Math ${it +10}")
        it + 10}

    /** Take - when we want to work on specific elements of the collection perform some
     * calculation and apply some chaining functions
     *
     * Drop - in case if you want to drop first few elements of the list,
     * usecase is same as dealing with collections and then performing calculations
     *
     * There are also other functions such as first() & last()
     */
    val firstItems = list.take(10).toList()
    println(firstItems)


    val dropList = (1..1000).toList()

     val dropItems = dropList.drop(800).toList()
      println(dropItems)
}