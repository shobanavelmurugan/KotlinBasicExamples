package kotlinfunction

class HigherOrderFunction {

    fun higherOrderFunction() {
        /* Passing a function to another function*/
        func("BeginnersBook", ::demo)

        /* function returns another function*/
        val sum = func(10)
        println("10 + 20: ${sum(20)}")
    }

    fun func(str: String, myfunc: (String) -> Unit) {
        print("Welcome to Kotlin tutorial at ")
        myfunc(str)
    }

    fun demo(str: String) {
        println(str)
    }
    fun func(num: Int): (Int) -> Int = {num2 -> num2 + num}
}