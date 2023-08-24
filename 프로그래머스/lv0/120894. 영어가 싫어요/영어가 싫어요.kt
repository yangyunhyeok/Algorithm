class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0
        var intNumbers = numbers

        intNumbers = intNumbers.replace("zero","0")
        intNumbers = intNumbers.replace("one","1")
        intNumbers = intNumbers.replace("two","2")
        intNumbers = intNumbers.replace("three","3")
        intNumbers = intNumbers.replace("four","4")
        intNumbers = intNumbers.replace("five","5")
        intNumbers = intNumbers.replace("six","6")
        intNumbers = intNumbers.replace("seven","7")
        intNumbers = intNumbers.replace("eight","8")
        intNumbers = intNumbers.replace("nine","9")
        println(intNumbers)
        answer = intNumbers.toLong()
        return answer
    }
}