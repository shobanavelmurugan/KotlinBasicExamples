package kotlinoops.interfacesample.overridingconflicts

interface B {
    fun foo() { println("foo B") }
    //fun bar()
    fun bar() { println("bar B") }
}