package inheritence

class Horse(colour: String,age: Int):Animal(colour,age) {
    fun neigh(){
        println("Horse makes sound of neigh")
    }
}