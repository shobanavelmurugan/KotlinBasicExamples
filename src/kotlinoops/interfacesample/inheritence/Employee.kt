package kotlinoops.interfacesample.inheritence

import javax.swing.text.Position

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: Position
) : Person