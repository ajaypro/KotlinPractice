package oo.interfaceDelegation

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 03-11-2019, 13:36
 */

interface Price{
    fun getPrice(): String
}

interface Company{
    fun getCompany(): String
}

interface Color{
    val color:String
}

// Creating phone red, samsung, $500

class Phone: Company, Price, Color {
    override fun getPrice() = "$500"
    override fun getCompany() = "Samsung"
    override val color: String = "Red"

    fun print() {
        println("${getPrice()} ${getCompany()} $color")
    }
}

 // Delegations

object LowPrice : Price{
    override fun getPrice() = "$500"
}

object BigCompany: Company{
    override fun getCompany() = "Nokia"
}

object GreenColor: Color{
    override val color = "Green"
}

 // using delegation in the below class we avoided a boilerplate code completely

class GreenPhone: Color by GreenColor,
        Company by BigCompany,
        Price by LowPrice

fun main(){
    /*val phone = Phone()
    phone.print()*/
    val greenPhone = GreenPhone()
    with(greenPhone){
        println("color ${getCompany()} ${getPrice()}")

    }
}