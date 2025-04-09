package kotlinc.code.src

import java.security.MessageDigest
import java.time.LocalDate

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = listOf("Abdallah", "Mohamed", "Saeed")
        apply(list, ::println)
        println("--------------------------------------")

        val userData = UserData("", "", "123", LocalDate.now())
        println(userData)

        println("-------------------------")
        val numbers = listOf(1, 2, 3,100, 200, 300, 150, 170)
        val ovenNumbers = numbers.filter() { it % 2 == 0 }
        println(ovenNumbers)

        println("--------------------")
        val oddFunc = fun(x: Int) = x % 2 == 1
        val oddNumbers = numbers.filter(oddFunc)
        println(oddNumbers)


    }

    private fun apply(names: List<String>, make:(String)-> Unit) {
        for(name in names) {
            make(name)
        }
    }
}

data class UserData(val name: String, val email: String, private val password: String, val dateOfBirth: LocalDate){

    fun password(): String{
        val hash =  MessageDigest.getInstance("SHA-256")
            .digest(password.toByteArray())
        return hash.joinToString("") { "%02x".format(it) }
    }
}