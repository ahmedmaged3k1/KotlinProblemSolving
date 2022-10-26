import java.util.*

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        nums.forEachIndexed {index1, number1 ->
            nums.forEachIndexed { index2, number2 ->
                if (number1+number2==target)
                {
                    return nums.filterIndexed { index, i -> index ==   index1|| index==index2}.toIntArray()
                }
            }
        }
        return IntArray(0)
    }
    fun main (){
        val reader = Scanner(System.`in`)
        print("Enter a size  of the list: ")
        var listSize  = reader.nextInt()
        val numberArray =  IntArray(listSize)
        numberArray.forEachIndexed { index, i ->
            print("Enter a numbers of the list: ")
            numberArray[index] = reader.nextInt()

        }


    }
}