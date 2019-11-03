package oo.generics

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 03-11-2019, 16:21
 */

// here watersupply is generic class
open class WaterSupply(var needsProcessing: Boolean){}

class TapWater: WaterSupply(true){
    fun addChemicalsCleaners(){
   needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false){}

class LakeWater: WaterSupply(true){
    fun filter(){
        needsProcessing = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {// setting boundry to class type hireachy as <T: WaterSupply> so it accepts only
    // object of water supply

    fun addWater(){
        check(!waterSupply.needsProcessing){ "Water supply needs processing"}
        println("Adding water from $waterSupply")
    }
}



fun genericsExample(){
    val aquarium = Aquarium(TapWater()) // Here we are creating Aquarium using TapWater of type Water Supply as generic

    /*println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalsCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")*/


    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    aquarium2.addWater()


}

fun main(){
    genericsExample()
}