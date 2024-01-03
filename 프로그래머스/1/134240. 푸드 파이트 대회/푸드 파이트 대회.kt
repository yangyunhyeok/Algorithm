class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var player1: String = ""
        var player2: String = ""
        var size = food.size - 1
        for (i in 1..size) {
            if (food[i] >= 2) {
                var count = food[i] / 2
                for (a in 1..count) {
                    player1 += i
                }
            }
        }
        player2 = player1.reversed()
        answer = player1 + "0" + player2
        return answer
        }
}