package higherorderfunctions

import java.io.File


/**
 * @Author Ajay on 12-10-2018.
 */

fun main(args:Array<String>){

       // SCOPING

      // We use bufferedReader object only within the let func {} which lets us to restrict the operation
       File("example.txt").bufferedReader().let {
              if(it.ready()){
                     println(it.readLine())
              }
       }

       //WORKING WTH NULLABLES

       val str:String? = "kotlin in android "

       //if(str?.isNotEmpty()) - error: this is nullable boolean in place of boolean is expected
      // if(str!!.isNotEmpty()) - can use unsafe call operator but it gets messy.

       // Here let is safe call operator that will execute code inside {} only if string is nullable type.
       str?.let {
              if(str.isNotEmpty()){ // Here we can call string object directly without ? operator
                     str.toLowerCase()
              }
       }
}
