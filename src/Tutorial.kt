import java.util.*

fun main() {

    val names = listOf("a", "abc", "ab")
    val items = listOf("a", "Ma", "M")
    val list = listOf("Maze", "Mr.", "More")
    // println(    itemsBeforeCondition(items,'a','M').toString())
    // println(    itemsWithCondition(list,'r','M').toString())
    // println(    itemsWithDefault(list,'r','M').toString())
    val inputExpression: String? = readLine()
    if (inputExpression != null) {
        if (isBalanced(inputExpression)) {
            print("Expression is  Balanced \n")
            print("Calculating ...... \n")
            calculateExpression(inputExpression)
        } else {
            print("Expression is  not Balanced \n")
        }
        
    }
}

// TODO: I want to return the only item that matches the following conditions:
// 1. The item contains the character 'r'
// 2. The item starts with the character 'M'
// Hint: If no match or more than one match were found, return default result.
// Hint: ["Mr.", "Maze"] will return "Mr.". ["Mr.", "More"] will return the default result
fun itemsWithDefault(list: kotlin.collections.List<String>, condition1: Char, condition2: Char): String {
    var item: String = ""
    var option: Int = 0
    list.forEach {
        if (it.contains(condition1) && it[0] == condition2) {
            option++
            item = it
        }
    }
    return if (option == 1) item
    else "Default Answer "
}


// TODO: I want to return the first item that matches the following conditions:
// 1. The item contains the character 'r'
// 2. The item starts with the character 'M'
// Hint: ["Maze", "Mr.", "More"] will return "Mr.".
fun itemsWithCondition(list: kotlin.collections.List<String>, condition1: Char, condition2: Char): String {
    list.forEach {
        if (it.contains(condition1) && it[0] == condition2) {
            return it
        }
    }
    return "Not Found"
}

// TODO: I want to return the items before the one that matches the following conditions:
// 1. The item contains the character 'a'
// 2. The item starts with the character 'M'
// Hint: ["a", "Ma", "M"] will return ["a"]
fun itemsBeforeCondition(
    list: kotlin.collections.List<String>,
    condition1: Char,
    condition2: Char
): MutableList<String> {
    var option = 0
    val resultNames: MutableList<String> = arrayListOf()
    list.forEachIndexed { index, s ->
        if (s.contains(condition1) && s[0] == condition2) {
            for (i in 0 until index) {
                resultNames.add(list[i])
                option++
            }

        }
    }
    if (option == 0) {
        println("Not Found")
    }
    return resultNames
}


// TODO: I want to return the items starting with the one that matches the following conditions:
// 1. The item length equals 'count'
// Hint: if items = ["a", "abc", "ab"] and count = 3, will return ["abc", "ab"]
fun itemsWithCount(list: kotlin.collections.List<String>, count: Int): MutableList<String> {
    var option = 0
    val resultNames: MutableList<String> = arrayListOf()
    list.forEachIndexed { index, s ->
        if (s.length == count) {
            for (i in index until list.size) {
                resultNames.add(list[i])
                option++
            }

        }
    }
    if (option == 0) {
        println("Not Found")
    }
    return resultNames
}

// TODO: I want to return the item lengths.
// Hint: ["a", "abc", "ab"] will return [1, 3, 2]
fun itemsLength(list: kotlin.collections.List<String>): MutableList<Int> {
    var numbersList: MutableList<Int> = arrayListOf()

    list.forEach {
        numbersList.add(it.length)
    }
    return numbersList
}


// TODO: I want to return true if all items match the following conditions:
// 1. The item length is >= 'count'
// Otherwise, return false.
// Hint: if items = ["a", "abc"] and count = 3, will return false.
fun checkCount(list: kotlin.collections.List<String>, count: Int): Boolean {
    list.forEach {
        if (it.length != count) return false
    }
    return true
}

//Balance Parentheses Of Equation
fun isBalanced(expression: String): Boolean {
    val stack = Stack<Char>()
    expression.forEach {
        if (it == '(') {
            stack.push(it)
        } else if (it == ')') {
            stack.pop()
        }

    }
    return stack.empty()
}

//Calculate Expression
fun calculateExpression(expression: String) {
    var result: Int = expression[1].toString().toInt()
    expression.forEachIndexed { index, char ->
        if (char == '(' || char == ')') return@forEachIndexed
        if (index == 1) return@forEachIndexed
        when (char) {
            '+' -> result += expression[index + 1].toString().toInt()
            '-' -> result -= expression[index + 1].toString().toInt()
            '*' -> result *= expression[index + 1].toString().toInt()
            '/' -> {
                if (expression[index + 1].toString().toInt() == 0) {
                    println("Cannot divide by zero , math error")
                    return
                }
                result /= expression[index + 1].toString().toInt()
            }
        }

    }
    print("result is $result \n")

}
