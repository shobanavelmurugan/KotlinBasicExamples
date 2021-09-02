package kotlinoops.visibilitymodifier

open class Outer {
    private val a = 1
    protected open val b = 2
    /* The internal visibility modifier means that the
    member is visible within the same module. */
    internal val c = 3
    val d = 4  // public by default
    
    protected class Nested {
        public val e: Int = 5
    }
}
