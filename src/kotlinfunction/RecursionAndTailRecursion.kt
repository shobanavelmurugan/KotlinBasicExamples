package kotlinfunction

class RecursionAndTailRecursion {

    /* Here the function myfunction() calls itself, this is a recursive function.

    fun myfunction(){
  //some code
  ....
  //myfunction() calling myfunction()
  myfunction()
}*/

    //recursive function
    fun fact(num: Int): Int {
        return if (num == 1) {
            num
        } else {
            //function fact() calling itself
            num * fact(num - 1)
        }
    }
    tailrec fun fact(n: Int, temp: Int = 1): Int {
        return if (n == 1){
            temp
        } else {
            fact(n-1, temp*n)
        }
    }
}