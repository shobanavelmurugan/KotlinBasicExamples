package kotlinoops.interfacesample

/* Interface */
interface MyInterface {

    fun bar()

    /* Properties in Interfaces*/
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}