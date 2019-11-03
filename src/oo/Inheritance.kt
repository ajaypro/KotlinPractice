package oo

/**
 * @Author Ajay on 19-10-2018.
 *
 * In kotlin by default all classes are closed (final), we use open keyword to make it inherit by other classes
 * we also use open for variables and properties
 */

  open class Glasses(val model: String, val price:Float){

    // To override fun we make it open
    open fun type() = if(price > 10) {
        "petjars"
    } else if(price > 20 && price < 40) {
        "big jars"
    } else {
        "bottles"
    }

}
  class Bottle(model: String, price:Float, isRound: Boolean): Glasses("containers", 34.56F){

      override fun type() = "idonized"
  }

  fun main(args: Array<String>){
      val petBottle = Bottle(price = 45.67F, isRound = false, model = "labs")

      println(petBottle.model)
      println(petBottle.price)
      println(petBottle.type())
  }

