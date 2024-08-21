class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var cola = n
        while (cola / a >= 1) {
            answer += cola / a * b
            cola = cola % a + cola /a*b
        }
        return answer
    }
}