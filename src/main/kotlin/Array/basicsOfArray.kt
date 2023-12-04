package Array

// An array is a data structure that holds a fixed number of values of the same type or its subtypes.
/*
* When to use array:
			1. Sequential Access-array provides fast and constant time access to the elements sequentially or randomly
			2. Fixed size-when we know the size of the array in advance ,and it won't in the future
			3. Homogeneous elements-when elements in array are of same type
			4. Simple Operations

		When not to use array:
			1. Dynamic size
			2. Insertion and deletion
			3. Key-Value Pairs
			4. Custom elements for special use-cases
			5. Heterogeneous elements
*/
fun main(){
    // Array definition,initialization and declaration
    var arrOfLaptops= arrayOf("Dell","MSI","Lenovo","Asus")
    println("Array of laptops:${arrOfLaptops.joinToString()}")

    // adding an element to the array
    arrOfLaptops+="HP"
    // joinToString() - is a more specific function used
    // to create a string by concatenating the string representations of elements in a collection with a separator, a prefix, and a postfix.
    println("Array of Laptop after adding an element: ${arrOfLaptops.joinToString(separator = ",", prefix = "[", postfix = "]")}")

    // null array used to create an array of null values
    // ? it specifies that the Array might be a null array
    val nullArray:Array<Int?> = arrayOfNulls(3)
    println("Null Array is:${nullArray.joinToString()}")

    // Empty array
    val emptyArray= emptyArray<Int>()
    println("Empty array is:${emptyArray.joinToString()}")

    // initialize the array with zero
    val arrayOne=Array<Int>(4){1}
    println("Array initialized with ones:${arrayOne.joinToString()}")

    // creating a random array
    val arrayRandom=Array(6){i->(i * i).toString()}
    arrayRandom.forEach { println(it) }

    // Creating a two-dimensional and three-dimensional array using nested arrays
    // We use contentDeepToString() method while printing the 2d or 3d arrays
    val twoDArray=Array(2){Array<Int>(2){0} }
    println("Two Dim Array is :${twoDArray.contentDeepToString()}")

    val threeDArray=Array(3){Array(3){Array<Int>(3){0} } }
    println("Three Dim Array is :${threeDArray.contentDeepToString()}")

    // Accessing the elements
    twoDArray[0][0]=9
    println("Two Dim Array after changing the value:${twoDArray.contentDeepToString()}")

    // you can pass a variable number of arguments to a function via the vararg parameter.
    // This is useful when you don't know the number of arguments in advance
    // To pass an array containing a variable number of arguments to a function, use the spread operator (*).
    val chars=arrayOf("a","b")
    // now we are passing array as argument because the function takes vararg parameter
    printAllChar(*chars,"c","d")

    // Comparing arrays
    // don't use == and !+ operator because it checks only whether the given variable belongs to same object
    // to compare the content of the array we use contentEquals method
    val arrayNum1=arrayOf(1,4,5)
    val arrayNum2=arrayOf(1,4,5)
    println("Comparing the arrayNum 1 & 2:${arrayNum1.contentEquals(arrayNum2)}")
    // sum of array
    println("sum of arrayNum1 is:${arrayNum1.sum()}")
    // shuffling an array
    arrayNum2.shuffle()
    println("shuffled arrayNum2 is:${arrayNum2.joinToString()}")
    // converting array to lst and set of collections
    println("before converting array to an Set:${arrayNum1.joinToString()}")
    println("after converting array to an Set:${arrayNum1.toSet()}")
    println("before converting array to an List:${arrayNum1.joinToString()}")
    println("converting array to an List:${arrayNum1.toList()}")

    // converting array with key value pair to map
    val arrayToConvertToMap=arrayOf(1 to "Senthil",2 to "Suresh")
    println("before converting array to Map:${arrayToConvertToMap.joinToString()}")
    println("after converting array to Map:${arrayToConvertToMap.toMap()}")


}

// function that takes vararg as parameter
fun printAllChar(vararg char:String){
    for(string in char ){
       println(string)
    }
}