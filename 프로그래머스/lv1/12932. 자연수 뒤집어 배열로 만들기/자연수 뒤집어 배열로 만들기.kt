class Solution {
    fun solution(n: Long): List<Int> {
        val temp = n.toString().reversed().chunked(1).map{it.toInt()}
        return temp
    }
}