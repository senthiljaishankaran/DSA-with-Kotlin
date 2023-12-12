package LeetCode.ProblemsOnArray

fun findingIndices(arr:Array<Int>,target:Int):List<Pair<Int,Int>>{
    var indicesList= mutableListOf<Pair<Int,Int>>()
    var complementMap=HashMap<Int,Int>()

    for((index,num) in arr.withIndex()){
        var compliment=target-num
        if(complementMap.containsKey(num)){
            indicesList.add(complementMap[num]!! to index)
        }
        complementMap[compliment]=index
    }
    return indicesList
}

fun main(){
    var arr= arrayOf(2,7,11,15)
    var target=9
    println(findingIndices(arr,target))
}