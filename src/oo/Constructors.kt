package oo

/**
 * @Author Ajay on 12-10-2018.
 */

// Constructor declaration in kotlin and initializing the varaibles

class House(val paint: String, val price: Int, val size: Float){

    // secondary constructor  taking only single argument

    constructor(paint: String) : this(paint, 0, 0F){
        println("Secondary constructor called")
    }

    // Third constructor  taking only 2 arguments
    constructor(paint: String, price: Int) : this(paint, 0, 0F){
        println("Third constructor called")
    }

    fun print(){
        println("House:[paint =$paint, price= $price, size = $size]")
    }
}

 fun main(args:Array<String>){
     // changing the order of arguments so variable name used.
     val smallHouse = House(price = 550, paint = "red", size = 1200.43F)

     // Call to sec. constructor
     val bigHouse = House("Wheat Cream")

     // Call to third constructor
     val mediumHouse = House("red", 1550)


     smallHouse.print()
     mediumHouse.print()
     bigHouse.print()


 }