package kotlinc.code.src.day1


fun main() {
    println("advanced function declarations")


    fun displayList(list: List<Int>) {
        println(list.joinToString("|", "{", "}"))
    }
    displayList(listOf(1, 2, 3, 4, 5))

    // anonymous function when assigning it to variable or passing as lambda

    val func = fun(str: String) { println(str)}

    func("Print from anonymous")


    // infix function -> to be like human-readable

    val pair: Pair<String, Long> = "size" to 100
    println(pair)

    // inline function -> used with higher order functions that takes functions as a parameter
    // not create memory object for the lambda and put the code inside the function as is

    apply(listOf("100", "200", "300"), ::println)
    // the inline here will take the println and apply it in the code instead of creating new memory object for the lambda
}

inline fun apply(list: List<String>, appMethod:(String)-> Unit) = list.forEach(appMethod)


