package oo.interfaceDelegation

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 02-11-2019, 21:33
 */

interface FishColor2{
    val color: String
}

interface FishAction2{
    fun eat()
}

// helper implemenatation classes for interface delegation goldcolor and greycolor
object GoldColor2: FishColor2 {
    override val color = "gold"
}

object GreyColor2: FishColor2 {
    override val color = "grey"
}


// Subclasses that uses interfaces and abstract classes
class Plecostomus2(fishColor: FishColor2  = GoldColor2): FishAction2,
    FishColor2 by GoldColor2 {
    override fun eat() {
        println("Avig eater")
    }
}

class Shark2: FishAction2, FishColor2 by GreyColor2 {
    override fun eat() {
        println("Strange eater")
    }
}

fun makeFish2() {
    val shark = Shark2()
    val pleco = Plecostomus2()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    makeFish2()
}