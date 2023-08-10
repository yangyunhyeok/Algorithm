class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        var a = my_string.toLowerCase().toList().sorted()
        println(a)
        answer = a.joinToString("")
        return answer
    }
}