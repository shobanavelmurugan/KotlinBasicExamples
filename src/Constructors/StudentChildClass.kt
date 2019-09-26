package Constructors

class StudentChildClass: CollegeParentClass {
    constructor(name: String, age: Int): super(name,age){
        println("child class constructor")
        println("StudentChildClass Name: $name")
        println("StudentChildClass Age: $age")
    }
}