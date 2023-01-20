class Solution {
    fun solution(s: String): String {
        var answer = ""
        var ts = s.split(" ").map { it.toString() }
        for(i in ts.indices) {
            for (j in ts[i].indices) {
                answer += if (j % 2 == 0 ) {
                    ts[i][j].uppercaseChar()
                } else {
                    ts[i][j].lowercaseChar()
                }
            }
            answer += " "
        }
        answer = answer.substring(0,answer.length-1)
        return answer
    }
}