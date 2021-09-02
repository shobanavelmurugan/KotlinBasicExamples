package kotlinmain

import kotlinexceptionhandling.ExceptionHandlingExample
import kotlinfunction.FunctionExamples
import kotlinfunction.HigherOrderFunction


fun main() {
    exceptionHandling()
    functionExample()
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
    FunctionExamples().recursionFunction()
    FunctionExamples().tailRecursionFunction()
    FunctionExamples().defaultArguments()
    FunctionExamples().defaultArguments(99)
    FunctionExamples().defaultArguments(99,'z')
    FunctionExamples().namedArguments(ch='z')
    FunctionExamples().lambdaFunction()
    HigherOrderFunction().higherOrderFunction()
}
