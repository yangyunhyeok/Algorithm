class Solution {
fun solution(x:Int, n:Int): LongArray {
    var answer = LongArray(n)
    var check = x.toLong()
    for(i in 0 until n){
        answer[i] = check
        check += x.toLong()
    }
    return answer
    }
}