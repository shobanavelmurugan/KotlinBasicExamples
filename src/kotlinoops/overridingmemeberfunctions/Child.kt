package overridingmemeberfunctions

class Child : Parent() {

    override var num: Int = 101

    override fun Demo() {
        super.Demo()
        println("demo function of child class")
    }

    fun Demo2() {
        /* Parent num value*/
        println(super.num)
        /* Child num value*/
        println(num)
    }
}