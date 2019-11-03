package oo

/**
 * @Author Ajay on 23-10-2018.
 */

open class Vehicles

open class fourWheelers: Vehicles()

class Car : fourWheelers() {

    fun main(args: Array<String>) {

        val fourWheelers: MutableList<fourWheelers> = mutableListOf(fourWheelers(), fourWheelers())
        fourWheelers.add(Car()) // Covariance as Car class is a derived type of fourWheelers

        /**
         * fourWheelers.add(Vehicles()) - Not a covariance as Car class is not derived type of fourWheelers
         * fourWheelers might have methods such as  tyreTypes(), carType() which vehicles might not have
         * Therefore Vehicles does not fulfill the contract of fourWheerlers
         */

        val parts: Any = fourWheelers() // covariance of more abstract type( Any)

        val carParts: fourWheelers = Car() // covariance of more dervied type

        val list: List<fourWheelers> = listOf<Car>() // covariance only for read-only collections

        //val list1: MutableList<fourWheelers> = mutableListOf<Car>()
        /**
         * This is not possible because  we cannot do Car.add(fourWheelers)
         * as fourwheelers is not derived type of car
         */
    }
}