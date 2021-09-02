package kotlinoopsmain

import kotlinoops.dataclasspck.DataClass
import kotlinoops.dataclasspck.Student

fun main() {
    dataClass()
    hashCodeEquals()
    copyMethod()
    toStringMethod()
    componentN()

}
fun dataClass() {
    val stu = DataClass("Chaitanya", 31)
    val stu2 = DataClass("Ajeet", 30)
    println("Student Name is: ${stu.stuName}")
    println("Student Age is:  ${stu.stuAge}")
    println("Student Name is: ${stu2.stuName}")
    println("Student Age is:  ${stu2.stuAge}")
}
fun hashCodeEquals(){
    val stu = DataClass("Chaitanya", 31)
    val stu2 = DataClass("Chaitanya", 31)
    val stu3 = DataClass("Ajeet", 30)

    /* Equals Method*/
    if (stu.equals(stu2)==true)
        println("stu is equal to stu2")
    else
        println("stu is not equal to stu2")

    if (stu.equals(stu3)==true)
        println("stu is equals to stu3")
    else
        println("stu is not equals to stu3")

    /*Hash code*/
    println("Hashcode of stu: ${stu.hashCode()}")
    println("Hashcode of stu2: ${stu2.hashCode()}")
    println("Hashcode of stu3: ${stu3.hashCode()}")
}
fun copyMethod(){
    val stu=Student("steve",26,"Math")

    // copying the age and subject from object stu
    val stu2=stu.copy(name="Lucy")

    println("stu:Name ${stu.name}, Age:${stu.age} & Subject ${stu.sub}")
    println("stu2:Name ${stu2.name}, Age:${stu2.age} & Subject ${stu2.sub}")
}
fun toStringMethod(){
    val stu=Student("Steve",26,"Math")
    println(stu.toString())
}
fun componentN(){

    val stu=Student("Steve",26,"Math")
    val name = stu.component1()
    val age=stu.component2()
    val sub=stu.component3()
    println("Name is:$name")
    println("Age is:$age")
    println("Subject is:$sub")
}
