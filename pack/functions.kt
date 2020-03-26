package pack
import java.util.*

fun hello() {
    println("Hello")
}

fun printWithSpace(text: String) {
    for( char in text) {
        print(char + " ")
    }
    println()
}

fun getDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if(a >= b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    hello()
    printWithSpace("Kotlin is good!")
    println(getDate())
    println(max(17,45))
}