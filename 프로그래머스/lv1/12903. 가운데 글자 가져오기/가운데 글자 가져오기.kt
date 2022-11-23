class Solution {
    fun solution(s: String): String {
        var answer = ""
        answer = s.slice((s.length-1)/2 .. (s.length/2))
        return answer
    }
}