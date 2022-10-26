import java.util.*

fun main() {

}



//    val reader = Scanner(System.`in`)
//    print("Enter a size  of the list: ")
//    var listSize  = reader.nextInt()
//    val numberArray =  IntArray(listSize)
//    numberArray.forEachIndexed { index, i ->
//        print("Enter a numbers of the list: ")
//        numberArray[index] = reader.nextInt()
//    }
//    print("Enter a Target   of the list: ")
//    val target  = reader.nextInt()
//    val list =  twoSum(numberArray,target)
//    println(    list.contentToString())
fun twoSum(nums: IntArray, target: Int): IntArray? {

    nums.forEachIndexed  {index1, number1 ->
        var i =1

        nums.forEach loop@ {

            var index2= index1+i
            if (index2>=nums.size)return@loop

            if (nums[index1]+(nums[index2])==target)
            {
                return listOf<Int>(index1,index2).toIntArray()
            }
            i++

        }
    }
    return null
}