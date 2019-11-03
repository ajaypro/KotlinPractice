package oo

/**
 * @Author Ajay on 21-10-2018.
 */

interface Places{
    fun location(){
        println("This is the correct location")
    }
}

class Office: Places{
    override fun location(){
        println("This is office") // default methods or functions can have in interfaces like java8, but we can
                                  // use abstract class for that purpose
    }
    fun cinema() = "Not a workplace"
}

class Home:Places{
    override fun location() {
        println("This is home")
    }
}

// Since office is type of places we can call location()
fun main(args: Array<String>){
    val landmarks:Places = Office()
    landmarks.location()
    //landmarks.cinema() // can only be called when type is Office for landmarks
}