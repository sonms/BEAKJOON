class Solution {
    fun solution(s: String): IntArray {
        var ps = s
        var answer: IntArray = intArrayOf(0,0)
        while (ps != "1") {
            answer[0] += 1
            ps.count {it == '0'}.apply {
                answer[1] += this
                ps = Integer.toBinaryString(ps.length-this)
            }
        }
        
        return answer
    }
}