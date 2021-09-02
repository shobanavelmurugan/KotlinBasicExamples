package kotlinoops.visibilitymodifier



class Bar {  }

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module

private fun foo() {println("foo()")  }// visible inside example.kt

fun baz() { println("baz()") }
