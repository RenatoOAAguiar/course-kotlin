**Typed programming language for JVM**

**Install IntelliJ?**

**About the language**

1. listOf
    - listOf(1,2,3,4) returns [1,2,3,4]
    - listOf(3, 'a', 3.8, "string")

2. var
    - var test = "variable"

3. val -- Acting like a constant
    - val name = "Renato"
    - name = "Test" * throw a error

4. Primitive Types 
    - string
    - boolean 
    - val b: Byte = 127
    - val s: Short = 24
    - val i: Int = 7 * Integer is the default if not specified data type
    - val l: Long 26752241
    - val l2 = 3L
    - val f: Float = 3.73f
    - val f: Float = 3.73  * will not work
    - val d2: Double = 3.14
    - val c: Char = 'c'
        - var f2: Float = 3.4f   
        - var d3: Double = 0.0
        - d3 = f2 * error
        - d3 = f2.toDouble() * correct
    
5. Expressions
    - 3 + 6
    - listOf(1,2,3,4)
    - "string 1 " + "string 2"
    - * Expressions have a value, statements do not

6. Statements
    - var item = "adfas"

7. Null
    - var str: String = null * error
    - var str: String? = null * correct
    - str?.length * correct
    - str.length * error
    - str!!.length * null pointer excception

8. Conditionals
    - if, same as always
    - when * works like a switch

        - var mode: Int = 3
        when (mode) {
            1 -> println("test")
            2 -> println("ok")
            else -> println("else this")
        }

        when (x) {
            5 -> println("x is 10")
            3*12 -> println("x is 3*12")
            "hey there".length -> println("x is lenght of the string")
            in 1..10 -> println("x is between 1 and 10")
            in 11..20 -> println("x is between 11 and 20")
            !in 11..20 -> println("x not between 11 and 20")
        }

9. Loops

    - for (i in 1..10) {

    }

10. Functions
    - See file functions.kt

11. 