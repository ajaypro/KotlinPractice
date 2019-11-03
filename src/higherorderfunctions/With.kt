package higherorderfunctions


/**
 * @Author Ajay on 12-10-2018.
 *
 * With - high order func, helps avoid multiple usage of variables of reference object to call their attributes
 */

fun main(){

    val props = System.getProperties()

     // props is variable which is used as receiver argument to with fun and rest
    // of attributes are accessed within its function.

    with(props){
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }

    //without with func, using variables names everywhere

    props.list(System.out)
    props.getProperty("user.home")
    props.propertyNames().toList()

}

