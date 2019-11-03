package oo.interfaceDelegation

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 03-11-2019, 14:09
 */

interface HorsePower{
    fun lowPower(): String
    fun mediumPower(): String
    fun highPower(): String
}

interface Model{
    fun sports()
    fun race()
}

abstract class Wheels{
    abstract fun tubless(): String
    fun broadTires(){}
}

object RaceWheels: Wheels(){
    override fun tubless()  = "50 radius"
}
object ferrariPower : HorsePower{
    override fun lowPower() = " 15 bhp"
    override fun mediumPower()  = "100bhp"
    override fun highPower()  = "1000bhp"
}

