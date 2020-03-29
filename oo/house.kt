package oo

class House(val height: Double, val color: String) {
    fun print() {
        println("House [height=$height, color=$color]")
    }
}

fun main(args: Array<String>) {
    var house = House(height= 4.5, color = "blue");
    house.print()
}