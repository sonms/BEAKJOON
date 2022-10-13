class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        for (i in phone_number.indices) {
            if (i >= phone_number.length - 4) {
                answer += phone_number[i]
            } else {
                answer += "*"
            }
            
        }
        return answer
    }
}