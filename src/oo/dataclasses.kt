package oo

/**
 * @Author Ajay on 16-10-2018.
 */


// Geenrates hashcode(), toString(), equals(), getters & setters

data class Cars(val model: String, val type: String, val price: Int, val year: Int)

fun main(args: Array<String>){

    val model1 = Cars("mustang", "race cars", 15000, 2010)
    val model2 = Cars("mustang", "race cars", 15000, 2010)

    println(model1)
    println(model2)

    //referential equality
    println(model1 === model2)

    //Structural equality
    println(model1 == model2)

    //copy()
    val raceModel = model1.copy(price = 20000)
    println(raceModel)
    //output - Cars(model=mustang, type=race cars, price=20000, year=2010)
    // Here the price is changed

    //Destructuring operator - we can assign variables for each component of model1 and use them in results
    val(model, type, year) = model1
    println("$model, $type, $year")

    //output - mustang, race cars, 15000
}