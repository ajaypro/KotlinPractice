package problemworkout

/**
 * @project KotlinPractice
 * @author AjayDeepakSrinivasan on 21-11-2019, 11:21
 */




    fun main(args: Array<String>){
        val str = "Android"
        var charOfString = ""
        str.indices.forEach { i ->
        charOfString += str[str.length-1 -i].toString()
    }
        print(charOfString)
    }
