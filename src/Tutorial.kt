import java.util.*

fun main() {


}

//    val reader = Scanner(System.`in`)
//
//    print("Enter a size  of the list 1 : ")
//    val listSize = reader.nextInt()
//    val numberArray = mutableListOf<Int>()
//    for (i in 0 until listSize) {
//
//        print("Enter a numbers of the list: ")
//        numberArray.add(reader.nextInt())
//    }
//
//    print("Enter a size  of the list 2 : ")
//    val list2Size = reader.nextInt()
//    val number2Array = mutableListOf<Int>()
//
//
//    for (i in 0 until list2Size) {
//        print("Enter a numbers of the list: ")
//        number2Array.add(reader.nextInt())
//
//    }
//    println(    addTwoNumbers(numberArray, number2Array).toString())
fun addTwoNumbers(
    l1: kotlin.collections.List<Int>,
    l2: kotlin.collections.List<Int>
): kotlin.collections.List<String>? {
    var firstNumber = String()
    var secondNumber = String()
    for (i in (l1.size - 1) downTo 0) {
        firstNumber = firstNumber.plus(l1[i].toString())
    }

    for (i in (l2.size - 1) downTo 0) {
        secondNumber = secondNumber.plus(l2[i].toString())


    }
    val result = (firstNumber.toInt()) + (secondNumber.toInt())
    var resultInString = result.toString()
    var l3 = mutableListOf<String>()
    for (i in resultInString.length - 1 downTo 0) {
        l3.add(resultInString[i].toString())

    }
    return l3
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

    nums.forEachIndexed { index1, number1 ->
        var i = 1

        nums.forEach loop@{

            var index2 = index1 + i
            if (index2 >= nums.size) return@loop

            if (nums[index1] + (nums[index2]) == target) {
                return listOf<Int>(index1, index2).toIntArray()
            }
            i++

        }
    }
    return null
}