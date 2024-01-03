class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
    var x = ""
    var size = seoul.size-1
    for(i in 0 .. size){
        if(seoul[i]=="Kim"){
            x = i.toString()
        }
    }
    answer = "김서방은 ${x}에 있다"

    return answer
    }
}