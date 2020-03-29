package oo

open class Person(open var name: String, open var age: Int) {
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
}

class Student(override var name: String, override var age: Int): Person(name, age) {

}

fun main(args: Array<String>) {
    val per = Student("Renato", 28)
    println(per.name)
    per.age = 35
    per.speak()
}