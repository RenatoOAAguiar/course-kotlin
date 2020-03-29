package oo

//data classes

class Book(val title: String, val author: String) {
    override fun toString(): String {
        return "Book[title=$title, author=$author]"
    }
}

data class DataBook(val title: String, val author: String) {
    
}

fun main(args: Array<String>) {
    val book = Book("super", "super")
    val dataBook = DataBook("super data", "super data")

    val (title, author) = dataBook
    val set = hashSetOf(dataBook, dataBook)

    println(book)
    println(dataBook)
    println(title)
    println(author)
    println(set)
}