package kotlinoops.nestedandinnerclass

class OuterClass {
    val oStr = "Outer Class"

    class NestedClass {
        val nStr = "Nested Class"
        fun demo()="demo() function of nested class $nStr"

        //nested class does not have access to the members of outer class
        //fun demo()="demo() function of nested class $oStr"
    }
}