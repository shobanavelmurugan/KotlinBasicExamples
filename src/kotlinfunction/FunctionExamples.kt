package kotlinfunction

class FunctionExamples {
    /* There are two types of functions in Kotlin:
    1. Standard Library Function
    2. User-defined functions*/

    fun standardLibraryFunction() {
        var num = 16
        println("Square root of $num is: ${Math.sqrt(num.toDouble())}")
    }
    fun userDefinedFunction(){
        println("Hello")
    }
    fun userDefinedFunctionWithArguments(vararg numbers: Int): Int{
        var sum = 0
        numbers.forEach {num -> sum +=  num}

        return sum
    }
    fun inlineFunction(){
        val sum={num1: Int,num2: Int->num1+num2}
        println("6+4= ${sum(6,4)}")
    }
}