package nullhandling

/**
 * @Author Ajay on 11-01-2019.
 */


// (1) Kotlin maps to primitive types if possible
val i: Int = 1       // Java int
val i2: Int? = null  // Java Integer

val d: Double = 6.674e-11  // Java double
val d2: Double? = null     // Java Double

// (2) All of these become List<Integer> in Java
// Note: more interesting is the other way around
val list: List<Int> = listOf()
val list2: List<Int>? = listOf()
val list3: List<Int?> = listOf()
val list4: List<Int?>? = listOf()