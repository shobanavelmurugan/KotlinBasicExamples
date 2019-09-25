package classesobjects

class ClassesAndObjectExample {

    // data member
    private var number: Int = 5

    // member function
    fun calculateSquare(): Int {
        return number * number
    }
}
/* Other Access modifiers:
private – Can be accessed inside the class only.
public – Can be accessed everywhere.
protected – Can be accessed to the class and its subclasses.
internal – Can be accessed inside the module.*/