class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val temp = n.toString()
        for (i in temp.indices) {
            answer += temp[i]-'0'
        }
        return answer
    }
}