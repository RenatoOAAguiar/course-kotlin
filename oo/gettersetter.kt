package oo

class Animal {
    var age: Int = 0
        get() = field
        set(value) {
            if(value >= 0) {
                field = value
            }
        }
}