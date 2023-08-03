class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        var list = rsp.toCharArray()
        for(i in list.indices){
            when(list[i]){
                '2' ->{
                    answer = answer + '0'
                }
                '0' ->{
                    answer = answer + '5'
                }
                '5' ->{
                    answer = answer + '2'
                }
            }
        }

        return answer
    }
}