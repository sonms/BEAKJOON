class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var d = 0
        var n = x.toString()
        for (i in n.toString().indices) {
            d += n[i] - '0'
        }
        answer = x % d == 0

        return answer
    }
}