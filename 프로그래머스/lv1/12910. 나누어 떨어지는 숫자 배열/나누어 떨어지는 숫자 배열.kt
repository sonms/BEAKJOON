class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        val s = arr.sorted()
        
        for (i in s.indices) {
            if (s[i] % divisor == 0) {
                answer += s[i]
            }
        }
        
        if (answer.isEmpty()) {
            answer += -1
        } 
        
        return answer
    }
}