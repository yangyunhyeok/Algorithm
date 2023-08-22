class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer = ""
        val id = id_pw[0]
        val pw = id_pw[1]
        for (i in db.indices) {
            if (id == db[i][0] && pw == db[i][1]) {
                answer = "login"
            } else if (id == db[i][0] && pw != db[i][1]) {
                answer = "wrong pw"
            } else if (answer != "login" && answer != "wrong pw") {
                answer = "fail"
            }
        }
        return answer
    }
}