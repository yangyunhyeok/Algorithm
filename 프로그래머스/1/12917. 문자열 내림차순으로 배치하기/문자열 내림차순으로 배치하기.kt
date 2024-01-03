class Solution {
    fun solution(s:String):String{
    var answer = ""
    var a = s.toCharArray()
    a.sort()
    a.reverse()
    answer = String(a)
    return answer
    }
}