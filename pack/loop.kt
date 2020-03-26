package pack

fun main(args: Array<String>) {
    for(i in 1..10) {
        println(i)
    }

    var list = listOf("Java", "C", "python")
    for(item in list) {
        println(item)
    }

    for((index, value) in list.withIndex()) {
        println("Element as index $index and value $value")
    }

    var x = 9

    while(x >= 0) {
        println(x)
        x--
    }

    for (c in "test") {
        if(c == 's') {
            break
        }
        print(c)
    }

    val l1 = listOf("livro", "mesa")

    for(str in l1) {
        if(!str.contains('o')) {
            continue
        }
        println(str)
    }

    // Naming loop
    outer@ for(i in 1..10) {
        for(j in 1..10){
            if(i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}