package src.exercises

import kotlin.properties.Delegates

/**
 * @Author Ajay on 15-01-2019.
 */
class Student {

    var name: String = "Ajay Deepak"
            get() = "Hey, myname is $field"
    set(value) {
        if(value.contains(" ")) field = value
    }

    val homework: String by lazy {
        println("Doing my homework")
        Thread.sleep(1000)
        "However I can borrow from my friends as well"
    }

    var dress: String by Delegates.observable("Jeans & Shirt",{property, oldValue, newValue ->
        println("Now im wearing $newValue")
    })

    fun dressNormally() {
        dress = "Jeans & Shirt"
    }

    fun dressFormally() {
        dress = "Shirt & Pant"
    }

    fun main(args: Array<String>) {
        val lizzy = Student()
       with(lizzy){
           dressFormally()
           dressNormally()
           name = "ajay"

           println(name)
           println(homework)
       }

    }
}