package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * @Author Ajay on 21-10-2018.
 *
 * Object is like singleton in java, but you don't have to use private constructor
 */

object Model{
    val type = "small"
    fun createModel() = Machines("big", 23456)
}

// we can use this click listener  for multiple button clicks  across the project just by passing
// mouseevent to mouseadapter rather than creating anonymous classes in java

object DefaultClickListener: MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        println("This button was clicked")
    }
}


fun main(args: Array<String>){
    // val m = Model() object cannot be created, rather variables and methods are accessed directly using Object name
    Model.type
    Model.createModel()
}