package visibilitymodifier

open class Parent {
    // by default public
    var num = 100
    // visible to this this class only
    private var str = "BeginnersBook"

    // visible to this class and the child class
    protected open val ch = 'A'

    // visible inside the same module
    internal val number = 99

    // visible to this class and child class
    open protected fun demo() { }
}