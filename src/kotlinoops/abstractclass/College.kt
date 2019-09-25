package kotlinoops.abstractclass

class College(name: String, age: Int) : StudentParent(name, age) {
    override fun func(message: String) {
        println(message)
    }
}