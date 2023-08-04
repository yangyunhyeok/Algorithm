class Solution {
    fun solution(my_string: String): String {
        var s1 = my_string.toMutableList()
        for(i in s1.indices){
            if(s1[i].isLowerCase()){
                s1[i] = s1[i].toUpperCase()
            }else if(s1[i].isUpperCase()){
                s1[i] = s1[i].toLowerCase()
            }
        }
        return s1.joinToString("")
    }
}