package Constructors

class InitializerInConstructor(val name: String = "StudentChildClass", var age: Int = 99) {

    val stuName: String
    var stuAge: Int
    init{
        if(name == "StudentChildClass") {
            stuName = "NA"
            stuAge = 0
        }
        else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("StudentChildClass Name is: $stuName")
        println("StudentChildClass Age is: $stuAge")
    }
}