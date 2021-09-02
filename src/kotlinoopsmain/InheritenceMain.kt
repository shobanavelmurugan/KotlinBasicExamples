import inheritence.Cat
import inheritence.Dog
import inheritence.Horse
import overridingmemeberfunctions.Child
import overridingmemeberfunctions.Cow

fun main() {
    val AppRef = "https://beginnersbook.com/2019/03/kotlin-inheritance/"

    inheritenceExample()
    overridingMemberFunction()
    overridingPropertiesOrDataMemberOfBaseClass()
    callingDataMemberAndMemberFunction()

}

fun inheritenceExample() {

    val d = Dog("Black", 4)
    d.woof()
    val c = Cat("white", 5)
    c.meow()
    val h = Horse("Brown", 10)
    h.neigh()
}

fun overridingMemberFunction() {
    val cow = Cow()
    cow.sound()
}
fun overridingPropertiesOrDataMemberOfBaseClass()
{
    val d = Cow()
    d.sound()
    println("${d.colour}")
}
fun callingDataMemberAndMemberFunction(){
    val obj=Child()
    obj.Demo()
    obj.Demo2()
}