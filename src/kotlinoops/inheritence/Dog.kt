package inheritence

class Dog(colour: String, age: Int) : Animal(colour, age) {
    init {
        displayMsg(colour, age).also { println() }
    }

    fun woof() {
        println("Dog makes sound of woof")
    }
}