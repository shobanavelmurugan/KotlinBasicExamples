package kotlinoops.interfacesample.overridingconflicts

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

//class D : A,B{
//    override fun foo() {
//        println("Class D-> foo()")
//    }
//
//    override fun bar() {
//        println("Class D-> bar()")
//    }
//
//}