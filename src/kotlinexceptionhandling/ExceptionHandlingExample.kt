package kotlinexceptionhandling

import java.lang.ArithmeticException
import java.lang.Exception

class ExceptionHandlingExample{

fun tryCatchFinally() {
    try {
        var num = 10 / 0
        println("Test Try Block")
        println(num)

    }catch (e: ArithmeticException){
        println("Arithmetic Exception")
    }
    catch (e: Exception) {
        println(e)
    } finally {
        println("It will print in any case.")
    }

}
fun throwAnException(){
    try {
        println("Before exception")
        throw Exception("Something went wrong here")
        println("After exception")
    }catch (e: Exception){
        println(e)
    }finally {
        println("You can't ignore me")
    }
}
fun multipleCatchBlock(){
    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some error occurred")
    }

    println("Out of try catch block")
}
fun  nestedTryCatch(){
    try {
        val num = 100 / 5
        println(num)
        try {
            val num2 = 100 / 0
            println(num2)
        }
        catch(e: NumberFormatException){
            println("Number Format Exception")
        }
    }
    catch(e: ArithmeticException){
        println("Arithmetic Exception")
    }
}
fun tryAsAnExpression(){
    var website = "Beginnersbook.com"
    var num = try {
        website.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num)

    var number = "100"
    var num2 = try {
        number.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num2)
}

}