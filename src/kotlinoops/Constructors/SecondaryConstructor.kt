package Constructors

class SecondaryConstructor {

    constructor(name: String, age: Int){
        println("secondary constructor with two param")
        println("SecondaryConstructor-----StudentChildClass Name: ${name.toUpperCase()}")
        println("SecondaryConstructor-----StudentChildClass Age: $age")
    }
    constructor(name: String): this(name, 0){
        println("secondary constructor with one param")
        println("SecondaryConstructor-----StudentChildClass Name: ${name.toUpperCase()}")
    }

    /* syntax
    constructor(name: String) {
        // code inside constructor
    }
    constructor(name: String, age: Int) {
        // code inside constructor
    }*/
}