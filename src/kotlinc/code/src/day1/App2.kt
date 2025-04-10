package kotlinc.code.src.day1

import java.lang.StringBuilder

fun main(args: Array<String>) {

    // operator overloading

    val ball = Coordinates(100, 100)
    println(-ball)
    println("After Addition ${+ball}")


    println("**************************")

    val upsizeResult = StringBuilder("INFO").upsize {
        it.append("Ahmed")
        println(it)
    }
    println("Upsize result $upsizeResult")

}

fun <T> T.upsize(action: (T)-> Unit): T {
    // this here refers to the calling object
    println("From upsize extension with lambda")
    action(this)
    return this
}

data class Coordinates(val x: Long, val y: Long) {
    operator fun unaryMinus() = Coordinates(-x, -y)
    operator fun unaryPlus()  = Coordinates(x, y)
}