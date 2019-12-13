package higherorderfunctions

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 20-11-2019, 21:55
 */

fun main(){

    // closure variable that can be modified within lambda braces
    var result = 0
    // updating variable inside lambda expression and printing it below.
    addNumbers(3,4){num1, num2 -> result = num1 + num2}
    print(result)

    val lambda: (Int,Int) -> Unit = {num1, num2 -> num1 + num2}
    // nomral lambda variable passed as parameter to function
    //addNumbers(3,4, lambda)

    // lambda  expression passed as parameter to function
    /*addNumbers(3,4){
            num1, num2 -> num1 + num2
    }*/


}
 // passing lambdas as parameters to function
fun addNumbers(a: Int, b: Int, action: (Int, Int) -> Unit){
    /*val sum = a+b
    println(sum)*/

     action(a,b)
}