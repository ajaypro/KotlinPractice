package src.nullhandling

/**
 * @Author Ajay on 12-01-2019.
 */


fun main(args: Array<String>) {

    // (1) Non-nameOrNull type
//  val notNull: String = null
    val notNull: String = "Be yourself; everyone else is already taken."
    println(notNull.toUpperCase())

    // (2) Nullable type
    val nullable: String? = null
    println(nullable?.toUpperCase())
    println(nullable!!.toUpperCase())  // Throws NullPointerException => don't use !!
}