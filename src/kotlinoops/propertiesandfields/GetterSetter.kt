package kotlinoops.propertiesandfields


class GetterSetter {

    val size:Int=1

    fun callGetterSetter(){
        syntax()
        backingFields()
        backingProperties()
        compileTimeConstant()
    }


    fun syntax(){
        /* The full syntax for declaring a property is
        var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
    The initializer, getter and setter are optional.
    */

        var allByDefault: Int? // error: explicit initializer required, default getter and setter implied
        var initialized = 1 // has type Int, default getter and setter

        /* mutable one in two ways: it starts with val instead of var and does not allow a setter:*/

        val simple: Int? // has type Int, default getter, must be initialized in constructor
        val inferredType = 1 // has type Int and a default getter

        /* Here's an example of a custom getter:*/
      //  val isEmpty: Boolean
        //get() = this.size == 0

        //val isEmpty get() = size == 0  // has type Boolean

//        var setterVisibility: String = "abc"
//        private set // the setter is private and has the default implementation
//
//        var setterWithAnnotation: Any? = null
//        @Inject set // annotate the setter with Inject
    }

    fun backingFields(){
        /* Fields cannot be declared directly in Kotlin classes.
        This backing field can be referenced in the accessors using the field identifier:*/
//        var counter = 0 // Note: the initializer assigns the backing field directly
//        set(value) {
//            if (value >= 0) field = value
//        }

        /* there will be no backing field: */
        val isEmpty: Boolean
       // get() = this.size == 0
    }
    fun backingProperties(){
 //       private var _table: Map<String, Int>? = null
//        public val table: Map<String, Int>
//        get() {
//            if (_table == null) {
//                _table = HashMap() // Type parameters are inferred
//            }
//            return _table ?: throw AssertionError("Set to null by another thread")
//        }
    }

    fun compileTimeConstant(){
//        const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
    }

    companion object {
        const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
    }
}