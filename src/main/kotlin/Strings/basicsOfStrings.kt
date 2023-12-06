package Strings

// Strings in Kotlin are represented as sequence of characters between double quotes
fun main(){
    // defining string using the Escaped String literal method
    var str="String in Kotlin Programming"

    // Accessing the character in a String using the index value as array-like object
    println(str[3])

    // Iterating over the string with for loop
    for(string in str){
        print(string)
    }
    println()

    // we could have known the concept of string pool from java
    // that strings are immutable
    // Any transformation in the String will return the string on a new object from the string pool
    // the first object remains the same
    // let see an example
    // here we transform the str string to upper case
    println(str.uppercase())
    // yet still if we print the string it remains the same
    println(str)

    // concatenation of the string
    // below concatenation will work as long as the first part is a String
    val name1="Senthil"+7
    val name2="Kumar"
    println(name1+name2)

    // multi-lined String using the """ string """
    // trimIndent-Detects a common minimal indent of all the input lines, removes it from every line
    // and also removes the first and the last lines if they are blank
    // trimMargin - trims leading whitespace characters followed by marginPrefix
    // from every line of a source string and removes the first and the last lines if they are blank
    val text="""
          |Hi, My name is Senthil kumar and
        I am a Software Engineer
    """.trimIndent().trimMargin("|")

    println(text)

    // String literals may contain template expressions – pieces of code that are evaluated and whose
    // results are concatenated into the string it starts with a '$' dollar sign followed by {}
    // let see an example
    val name="Kotlin"
    println("The length of string name is:${name.length}")

    // String formatting is built in Kotlin language
    // it must contain at-least one place-holder("%") and can have one or more arguments("Strings to be formatted")
    // place-holders are followed by the formatting arguments

    val integerNumber=String.format("%07d",1234) // formats to add zero and make the length 7
    println(integerNumber)

    val floatNumber=String.format("%+.4f",9.546600)// formats the decimal places to four digits only
    println(floatNumber)

    val uppercaseStrings=String.format("%S %S","kotlin","language")// makes the two place-holder strings to print in upper case
    println(uppercaseStrings)

}


