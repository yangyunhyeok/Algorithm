class Solution {
fun solution(x: Int): Boolean {
    var answer = false
    var sum = 0
    var num = x
    while (num > 0) {
        sum += num % 10
        num /= 10;
    }
    if (x % sum == 0) {
        answer = true
    }
    return answer
    }
}