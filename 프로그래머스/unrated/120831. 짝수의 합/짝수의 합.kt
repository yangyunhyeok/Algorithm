class Solution {
fun solution(n:Int): Int {
    var result:Int = 0
    for (i in 1 ..  n){
        if(i%2==0){
            result = result + i
        }
    }
    return result
}
}