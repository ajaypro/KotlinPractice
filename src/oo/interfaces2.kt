package oo

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 03-11-2019, 12:20
 */

interface FishColor1{
    val color: String
}

interface FishAction1{
    fun eat()
}


class Plecostomus1: FishColor1, FishAction1 {
    override val color = "gold"
    override fun eat() {
        println("Avig eater")
    }
}

class Shark1: FishColor1, FishAction1 {
    override val color = "grey"
    override fun eat() {
        println("Strange eater")
    }
}

fun makeFish1() {
    val shark = Shark1()
    val pleco = Plecostomus1()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    makeFish1()
}