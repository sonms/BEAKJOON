class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for (i in s.indices) {
            answer += if (s[i] in 'A'..'Z') {
                if (s[i].code + n > 90) {
                    (s[i].code - (26-n)).toChar()
                } else {
                    (s[i].code + n).toChar()
                }
            } else if (s[i] in 'a'..'z') {
                if (s[i].code + n > 122) {
                    (s[i].code - (26 - n)).toChar()
                } else {
                    (s[i].code + n).toChar()
                }
            } else {
                ' '
            }
        }
        return answer
    }
}