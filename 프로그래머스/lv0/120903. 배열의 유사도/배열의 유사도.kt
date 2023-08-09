class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(i in s1.toList())
            for(j in s2.toList()){
                if(i == j){
                    answer += 1
                }
            }
        return answer
    }
}