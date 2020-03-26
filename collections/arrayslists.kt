package collections

fun main(args: Array<String>) {
    val array = arrayOf("Goiânia", "Trindade", "Nazário")
    //array.add error

    val list = listOf("Laranja", "Maçã", "Bananas")
    //list.add error

    val numbers = intArrayOf(1,2,3,4)

    val newarray = arrayOf("Abadia", "Guapó")

    val concatArray = array + newarray
    println(concatArray.size)
    println(numbers.isEmpty())

    //lists

    val arrayList = arrayListOf("Renato", "Maria", "João")
    println(arrayList.contains("test"))
    arrayList.add("Carlos")
    arrayList.add(1, "Marcus")
    println(arrayList)

    arrayList.remove("Renato")
    println(arrayList)

    val subList = arrayList.subList(1,2) //start and end
    println(subList)
}