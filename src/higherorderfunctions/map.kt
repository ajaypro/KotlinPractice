package higherorderfunctions


/**
 * @Author Ajay on 04-10-2018.
 *
 * Maps & Flatmaps are widely used today in java8 and also in kotlin therefore make best use of these functions. I will
 * try to add more examples if possible.
 */



fun main(){

    //map() - applies the function to each element, in this case it is mulitplying the element by 2

    val list = (1..100).toList()

    println(list.map { it * 2})

    val average = list.average()
    val shifted = list.map { it - average }

    println(shifted)

    //flatmap() - flattens nested lists into a single list and applies the function to each element.

    val items = listOf((1..10).toList(),
            (11..20).toList(),
            (21..30).toList())

    println(items.flatMap { it.sortedDescending()})
}