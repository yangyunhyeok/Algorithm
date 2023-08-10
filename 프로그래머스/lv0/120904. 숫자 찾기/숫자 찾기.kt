class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var a = 0
        num.toString().toList()
        for(i in num.toString().toList()){
            a = a + 1
            if(i.digitToInt() == k){
                answer = a
                break
            }else{
                answer = -1
            }
        }
        return answer
    }
}