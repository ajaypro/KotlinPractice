package oo.interfaceDelegation

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 02-11-2019, 21:33
 */

interface FishColor{
    val color: String
}

interface FishAction{
    fun eat()
}

// helper implemenatation classes for interface delegation goldcolor and greycolor
object GoldColor: FishColor {
    override val color = "gold"
}

object GreyColor: FishColor {
    override val color = "grey"
}

// Subclasses that uses interfaces and abstract classes
class Plecostomus: FishAction, FishColor by GoldColor {
    override fun eat() {
        println("Avig eater")
    }
}

class Shark: FishAction, FishColor by GreyColor {
    override fun eat() {
        println("Strange eater")
    }
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    makeFish()
}