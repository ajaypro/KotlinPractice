package oo.interfaceDelegation

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 02-11-2019, 21:33
 */

interface FishColor3{
    val color: String
}

interface FishAction3{
    fun eat()
}

// helper implemenatation classes for interface delegation goldcolor and greycolor
object GoldColor3: FishColor3 {
    override val color = "gold"
}

object GreyColor3: FishColor3 {
    override val color = "grey"
}
// delegate helper class that implements fishAction interface
class PrintingEat(val food: String) : FishAction3{
    override fun eat() {
        println(food)
    }
}

// Subclasses that uses interfaces and abstract classes
class Plecostomus3(fishColor: FishColor3  = GoldColor3): FishAction3,
    FishColor3 by GoldColor3 {
    override fun eat() {
        println("Avid eater")
    }
}

class Shark3:
    FishColor3 by GreyColor3,
    FishAction3 by PrintingEat("Strange Eater") {
}

fun makeFish3() {
    val shark = Shark3()
    val pleco = Plecostomus3()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    makeFish3()
}