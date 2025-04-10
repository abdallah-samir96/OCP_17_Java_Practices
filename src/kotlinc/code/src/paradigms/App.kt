package kotlinc.code.src.paradigms

object App {
    @JvmStatic
    fun main(args: Array<String>) {

        // Imperative paradigm -> here we tell how to make the operation
        val x: Long = 100
        val y: Long = 100
        println(x * y)

        println("**************************")

        // Declarative paradigm -> we list what we want
        // select name, email from users where id = 100;
        // Like SQL, HTML, CSS which depends on engine that take the order and returns result



        // Procedural Programming Paradigm(procedure|function|Subroutine)
        calculateSum(100, 200)
        println("**************************")




        // Object-oriented- programming paradigm(OOP) -> state, behaviour
        val user = User("Ahmed", "ahmed@a.com")
        user.sendEmail()
        println("*************************")



        // Functional Programming Paradigm -> passing function into another function(lambda expression)

        val numbers = listOf(3, 5, 10, 20, 30)
        val filterFunction: (Int)-> Boolean = {
             it % 2 == 0
        }

        val result = numbers.filter(filterFunction)
        println(result)

    }
    private fun calculateSum(a: Int, b: Int) {
        val result = a + b
        printResult(result)
    }

    private fun printResult(result: Int) = println("The result is $result")
}


data class User(val name: String, val email: String) {

    fun sendEmail(){
        println("Sending email for user: $name with email: $email")
    }

}

