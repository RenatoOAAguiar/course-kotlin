package oo

interface Driveable {
    fun drive() 
}

class Car(val color: String): Driveable {
    override fun drive() {
        println("Driving carrrrrr");
    }
}

class MotorCycle(val color: String): Driveable {
    override fun drive() {
        println("Driving motorcycle");
    }
}