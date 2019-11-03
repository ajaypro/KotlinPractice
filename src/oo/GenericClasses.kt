package oo

/**
 * @Author Ajay on 22-10-2018.
 */


val list: List<Int> = listOf(1,4,6,7)

class Softwares<T>{

    // We are using generic as type parameters
    val values: MutableMap<Double, T> = mutableMapOf()

    //Using generics as method arguemnts
    fun count(Type: T){
        values.put(12.0, Type)
        values.put(10.3, Type)
        println(values.count())
    }
    // Using generics as return type
    fun getLatest():T{
        return values.values.last()
    }

}

class Trucks<E>{

    val containers:MutableSet<E> = mutableSetOf()
    val route = "ON_ROUTE"
    val app = "Whatsapp"

    fun isContainer(element: E){
        containers.add(element)
    }

    fun routes(element: E):E {

        if(route == element){
            println("Containers")
        }else{
            println("Not container")
        }
        return containers.first()
    }

    //Generic Functions

    fun <E>truckRoutes(vararg yrs:E):Trucks<E>{
          val result = Trucks<E>()
        for(yr in yrs){
            result.routes(yr)
        }
        return result
    }
}

fun main(args: Array<String>){
    val software:Softwares<String> = Softwares() // Generic type is given as String, software.count() return string
    software.count("Coded")
    println(software.getLatest())

    val truck:Trucks<String> = Trucks()
    truck.isContainer("true")
    println(truck.routes("ON_ROUTE"))


    //Generic Functions
    val heavyTrucks:Trucks<Int> = Trucks()
    heavyTrucks.truckRoutes(6)
}