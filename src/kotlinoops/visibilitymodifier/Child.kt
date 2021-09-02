package visibilitymodifier

class Child :Parent(){
    /* num, ch, number and function demo() are
     * visible in this class but str is not visible.
     */
    override val ch = 'Z'
    override fun demo(){
        println("demo function of child class")
    }
}