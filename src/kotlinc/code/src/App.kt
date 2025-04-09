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