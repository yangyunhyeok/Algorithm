class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var a:Int = 0
        var b:Int = 0
        numbers.sort()
        numbers.reverse()
        a = numbers[0]
        b = numbers[1]
        answer = a * b
        return answer
    }
}