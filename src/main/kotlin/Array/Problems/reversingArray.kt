package Array.Problems

fun reversingArray(arr:Array<Int>) {
    var start=0
    var end=arr.size-1
    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}

fun printingArray(arr:Array<Int>,size:Int){
    for(array in arr){
        println(array)
    }
}
fun main(){
    var arr= arrayOf(1,2,3,4)
    var size=arr.size
    println("Array before reversing")
    printingArray(arr,size)
    println("Array after reversing")
    reversingArray(arr)
    printingArray(arr,size)
    println("Reversing using recursion method")
    // recursion means function calling itself reversingArrayRecursion function calls itself in the if block till the cond satisfies
    reversingArrayRecursion(arr,0,arr.size-1)
    printingArray(arr,size)
}

// Recursion approach
fun reversingArrayRecursion(arr:Array<Int>,start:Int,end:Int) {
    if (start<end){
        val temp=arr[start]
        arr[start]=arr[end]
        arr[end]=temp
        reversingArrayRecursion(arr,start+1,end-1)
    }
}
