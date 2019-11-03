package oo

/**
 * @Author Ajay on 21-10-2018.
 */

interface Drivable{
    open fun drive(){
        println("Drive (interface)")
    }
}
abstract class Vehicle(open val brand: String = " "){
    open fun drive(){
        println("Car driving")
    }
     abstract fun honk()
}
 // overrided val by var in the inheriting class's constructor or even in variables
// cannot override var with val
class HutchBack(override  var brand: String ="AUDI"): Vehicle(), Drivable{

    override fun drive() {
        // When we override we use parent class as parameter to override the super class method to avoid ambiguity
        super<Vehicle>.drive()
    }

     override fun honk() {
         println("Tuu..tu....")
     }
 }

class suv:Drivable{
    override fun drive() {
        super.drive()
    }
}

fun main(args: Array<String>){
    val hutchBack = HutchBack("Bentely")
    println(hutchBack.drive())

}