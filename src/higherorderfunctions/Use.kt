package higherorderfunctions

import java.io.FileReader

/**
 * @Author Ajay on 12-10-2018.
 *
 * Use - something like try resources in java which handles the closure of resources
 * that we open like db, socket, scanner, file reader etc.. we don't have to close it explicity.
 */

  fun main(args: Array<String>){

    // use fun can be called only on classes that implment closeable interface thats because it implements
    // the close(), so that we don't have to explicity close the object.

    FileReader("example.txt").use {
        val list = it.readLines()
        println(list)

    }
}

