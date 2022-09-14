class Solution {
    fun solution(s: String): String {
        var answer = ""
        var temp = s.split(" ").map {it.toInt() }
        
        answer = "${temp.minOrNull().toString()} ${temp.maxOrNull().toString()}"
        
        return answer
    }
}