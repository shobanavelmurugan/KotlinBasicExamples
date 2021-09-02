package kotlinoops.nestedandinnerclass

class InnerClassExample {

    val oSt = "InnerClassExample Class"

    inner class InnerClass {
        val nStr = " InnerClass Nested Class"
        fun demo() = "demo() function using $oSt"
    }
}