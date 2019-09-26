import visibilitymodifier.Child
import visibilitymodifier.Parent

fun main() {
    /* obj.num and obj.number are visible
    * obj.ch, obj.demo() and obj.str not visible
    */
    val obj = Parent()

    /* obj2.ch and obj2.demo() are not visible because if
     * you override protected members in child class without
     * specifying modifier then they are by default protected
     */
    val obj2 = Child()
}