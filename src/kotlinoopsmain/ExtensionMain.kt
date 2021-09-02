package kotlinoopsmain

import kotlinoops.extensionspck.Example
import kotlinoops.extensionspck.Rectangle
import kotlinoops.extensionspck.Shape

fun main(){
    fun Shape.getName() = "Shape"

    fun Rectangle.getName() = "Rectangle"

    fun printClassName(s: Shape) {
        println(s.getName())
    }

    printClassName(Rectangle())

    fun Example.printFunctionType() { println("Extension function") }

    Example().printFunctionType()
}