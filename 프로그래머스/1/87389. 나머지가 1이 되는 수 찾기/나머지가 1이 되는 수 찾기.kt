class Solution {
fun solution(n:Int): Int {
    var result:Int = 0
    for (i in 1 ..  n){
        if(n%i==1){
            result = i
            break
        }
    }
    return result
}
}