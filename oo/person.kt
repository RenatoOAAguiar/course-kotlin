package oo

class Person(var name: String, var age: Int) {
    //var name: String
    //var age: Int

    init {
        //this.name = name
        //this.age = age
        println("was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun isIntellingent() = true
}

fun main(args: Array<String>) {
    val per = Person("Renato", 28)
    println(per.name)
    per.age = 35
    per.speak()
    println(per.isIntellingent())
}