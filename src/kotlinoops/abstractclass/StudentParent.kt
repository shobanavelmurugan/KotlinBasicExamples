package kotlinoops.abstractclass

abstract class StudentParent(name: String,age: Int) {
    init {
        println("Student name is: $name")
        println("Student age is: $age")
    }
    //non-abstract-function
    fun demo()
    {
        println("Non-abstract function of abstract class")
    }
    //abstract function
    abstract fun func(message:String)

}