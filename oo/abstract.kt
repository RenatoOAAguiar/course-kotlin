package oo

abstract class Person(open val name: String, open var age: Int) {
    abstract fun speak()
}

class Student(override val name: string, override var age: Int) {
    override fun speak() {
        println("Speaaaaak")
    }
}