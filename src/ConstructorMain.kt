import Constructors.*

fun main() {
    primaryCostructor()
    defaultValueInConstructor()
    initializerInConstructor()
    secondaryConstructor()
    secondaryConstructorWithParentAndChild()


}

fun primaryCostructor() {
    //creating the object of class StudentChildClass
    val stu = PrimaryConstructorExample("Chaitanya", 31)

    println("StudentChildClass Name: ${stu.name}")
    println("StudentChildClass Age: ${stu.age}")
}
fun defaultValueInConstructor()
{
    //creating the object of class StudentChildClass
    val stu = DefaultValueInConstructor("Chaitanya", 31)
    val stu2 = DefaultValueInConstructor("Chaitanya")
    val stu3 = DefaultValueInConstructor()

    println("Name: ${stu.name} and Age: ${stu.age}")
    println("Name: ${stu2.name} and Age: ${stu2.age}")
    println("Name: ${stu3.name} and Age: ${stu3.age}")
}
fun initializerInConstructor() {
    InitializerInConstructor("Chaitanya", 31)
    InitializerInConstructor("Chaitanya")
    InitializerInConstructor()
}
fun secondaryConstructor()
{
    SecondaryConstructor ("Ajeet", 30)
    SecondaryConstructor ("Ajeet")
}
fun secondaryConstructorWithParentAndChild(){
    StudentChildClass("Harry", 24)
}