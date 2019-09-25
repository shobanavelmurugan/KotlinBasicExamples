package overridingmemeberfunctions

class Cow : Animal() {
    /* Data Member*/
    override var colour: String = "Black"

    /* Member Function*/
    override fun sound() {
        super.sound()
        println("Cow makes a sound of ma ma..")
    }
}