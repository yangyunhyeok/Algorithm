fun main(){
    var s1 = Solution()
    println(s1.solution(7,2))
}

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = num1/num2
        return answer
    }
}