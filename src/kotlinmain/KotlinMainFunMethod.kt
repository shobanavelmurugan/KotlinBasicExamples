package kotlinmain

import kotlinexceptionhandling.ExceptionHandlingExample
import kotlinfunction.FunctionExamples
import kotlinfunction.RecursionAndTailRecursion


fun main() {
    exceptionHandling()
    functionExample()
    recursionFunction()
    tailRecursionFunction()
}
fun exceptionHandling(){
    ExceptionHandlingExample().tryCatchFinally()
    ExceptionHandlingExample().throwAnException()
    ExceptionHandlingExample().multipleCatchBlock()
    ExceptionHandlingExample().nestedTryCatch()
    ExceptionHandlingExample().tryAsAnExpression()
}
fun  functionExample(){
    FunctionExamples().standardLibraryFunction()
    FunctionExamples().userDefinedFunction()
    FunctionExamples().userDefinedFunctionWithArguments(50)
    println("sum:${FunctionExamples().userDefinedFunctionWithArguments(10,20,30,40)}")
    FunctionExamples().inlineFunction()
}
fun recursionFunction(){
    print("Enter a positive integer number: ")
    val number: Int =Integer.valueOf(readLine())
    val factorial = RecursionAndTailRecursion().fact(number)
    println("Factorial of $number = $factorial")
}
fun tailRecursionFunction(){
    val number = 6
    val factorial = RecursionAndTailRecursion().fact(number)
    println("Factorial of $number = $factorial")
}