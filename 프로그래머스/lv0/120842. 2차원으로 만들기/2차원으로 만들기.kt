class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val answer = Array(num_list.size / n) { IntArray(n) }
        var count = 0
        for(i in 0 until num_list.size/n){
            for(e in 0 until n){
                answer[i][e] = num_list[count]
                count ++
            }
        }
        return answer
    }
}