package kotlinoopsmain

import kotlinoops.nestedandinnerclass.InnerClassExample
import kotlinoops.nestedandinnerclass.OuterClass

fun main() {

    nestedClass()
    innerClass()

}
fun nestedClass(){

    //accessing data member of nested class
    println(OuterClass.NestedClass().nStr)
    //accessing member function of nested class
    println(OuterClass.NestedClass().demo())

    //creating object of the Nested class
    val obj=OuterClass.NestedClass()
    println(OuterClass().oStr)
    println(obj.demo())
}
fun innerClass()
{
    val inn=InnerClassExample()
    println("${inn.InnerClass().demo()}")

    val i2=InnerClassExample().InnerClass()
    println("${i2.demo()}")
}