package kotlinoops.sealedclasspck

open class Color {
    class Red: Color()
    class Orange:Color()
    class Blue:Color()
}
fun eval(c:Color)=
        when(c){
         is Color.Red-> println("Paint in Red color")
            is Color.Orange-> println("Paint in Orange color")
            is Color.Blue-> println("Paint in Blue color")
            else ->println("Paint in any Color")
        }

/*Rules of a Sealed class in Kotlin
1. We cannot create the object of a sealed class which means a sealed class cannot be instantiated.
2. All the subclasses of a sealed class must be declared within the same file where the sealed class is declared.
3. The constructor of sealed class is by default private and we cannot make it non-private.*/