package oo

/**
 * @Author Ajay on 21-10-2018.
 */

fun HutchBack.replaceWheel(){
    println("Replacing Wheel...")
}

fun suv.startEngine():Boolean{
    println("Starting Engine...")
    return true
}

fun main(args:Array<String>){
    val vehicle: Drivable = HutchBack()
    vehicle.drive()

    if(vehicle is HutchBack){
    //val hb = (HutchBack)Vehicle - In java we typecast variable hb to Vehicle object, but not in kotlin
    vehicle.replaceWheel()
} else if(vehicle is suv){
        vehicle.startEngine()
    }

}