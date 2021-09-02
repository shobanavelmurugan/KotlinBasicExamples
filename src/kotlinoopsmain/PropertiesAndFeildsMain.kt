package kotlinoopsmain

import kotlinoops.propertiesandfields.DeclaringProperties

fun main(){

    val appRef="https://kotlinlang.org/docs/reference/properties.html"

    val temp=copyAddress(DeclaringProperties())
    println("Declaring Properties-> Name: ${temp.name}, Street:${temp.street}, City:${temp.city}, State:${temp.state}, Zip:${temp.zip}")
}

fun copyAddress(address: DeclaringProperties): DeclaringProperties {
    val result = DeclaringProperties() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    result.city=address.city
    result.zip=address.zip
    result.state=address.state
    return result
}