class Solution {
    fun solution(left: Int, right: Int): Int {
            var answer: Int = 0
    var check = 0
    for(i in left .. right){
        for(a in 1 .. i){
            if(i%a==0){
                check += 1
            }
        }
        if(check%2==0){
            answer += i
        }else{
            answer -= i
        }
        println(answer)
        check = 0
    }
    return answer
    }
}