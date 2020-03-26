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

