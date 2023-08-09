class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        var list = my_string.toMutableList()
        var a = list[num1]
        var b = list[num2]
        list[num1] = b
        list[num2] = a
        answer = list.joinToString("")
        return answer
    }
}