package oo

/**
 * @Author Ajay on 21-10-2018.
 */

interface  MachineFactory{
    fun createMachine(): Machines
}

class Machines(size: String, price: Int){


    /** Similar to static in java but companion object is runtime
     * we can also implement interfaces or extend classes unlike static and
     * access variables of class with only names
     */

    companion object: MachineFactory {
        val MACHINE_COUNT = 12
        fun highEndMachines() = Machines("Bigsize", 5500)
        fun lowEndMachines() = Machines("smallsize", 3500)
        override fun createMachine() = Machines.highEndMachines()
    }

    fun main(args:Array<String>){
        println(Machines.MACHINE_COUNT)
        val highEndMachines = Machines.highEndMachines()
        val lowEndMachines = Machines.lowEndMachines()

        println(highEndMachines)
        println(lowEndMachines)
    }
}