class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length == 4 || s.length == 6) {
            for (i in s.indices) {
                if (s[i].isDigit()) {
                    answer = true
                } else {
                    answer = false
                    break
                }
            }
        } else {
            answer = false
        }
        return answer
    }
}