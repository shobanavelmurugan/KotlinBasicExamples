package inheritence

open class Animal(colour: String, age: Int) {
    init {
        displayMsg(colour,age)
    }
    fun displayMsg(colour: String, age: Int){
        println("Colour is : $colour")
        println("Age is : $age")
    }
}