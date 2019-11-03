package higherorderfunctions

/**
 * @Author Ajay on 12-10-2018.
 *
 * InlineFunctions - avoid memory overhead which happens  when higher order functions which lets you pass
 * functions as parameters as well as return functions which are stored as objects in memory heap.
 */


  fun main(args:Array<String>){
    var a = 2;
    someMethod(a, {println("Dummy function")})
}
// inline keyword here, expands function  and function paramters at callsite to reduce
// call overhead
  inline fun someMethod(a: Int, func: () -> Unit): Int{
      func()
      return 2 * a
  }

/**
 * A few more things to know when working with inline functions
* We can have some lambdas inlined, when passed in an inline function by using noinline modifier.
* A normal return statement is not allowed inside a lambda. If we want to explicitly return from a lambda,
   we need to use a label
* To access type passed as parameter we use reified type parameter.
* As mentioned above we can inline properties in Kotlin, and also inline just specific accessor of a property.
 *
 *  inline var props.isEmpty: Boolean
 *    get() = props.getProperty("user.name")
 *
 * inline usage should be avoided with large functions or accessors with large code logic
 */






