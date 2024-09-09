class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
    
        var current = 0

        for (s in section) {
            if (current < s) {
                current = s + m - 1
                answer++ 
            }
        }
        return answer
    }
}