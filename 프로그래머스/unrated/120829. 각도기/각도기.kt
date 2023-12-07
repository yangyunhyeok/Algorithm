class Solution {
fun solution(a:Int): Int {
    var result:Int = 0
    if(a<90){
        result = 1
    }else if(a==90){
        result = 2
    }else if (90<a&&a<180){
        result = 3
    }else if (a == 180){
        result = 4
    }
    return result
}
}