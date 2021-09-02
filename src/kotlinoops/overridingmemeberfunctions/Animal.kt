package overridingmemeberfunctions

open class Animal {
    /* Data Member*/
    open var colour: String = "White"

    /* Member Function*/
    open fun sound() {
        println("Animal makes a sound")
    }
}