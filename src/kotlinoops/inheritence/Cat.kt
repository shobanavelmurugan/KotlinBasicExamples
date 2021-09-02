package inheritence

class Cat(colour: String, age: Int) : Animal(colour, age) {
    fun meow() {
        println("Cat makes sound of meow")
    }
}