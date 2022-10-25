class Solution {
    fun solution(n: Long): IntArray {
        val temp = n.toString().reversed().chunked(1).map{it.toInt()}.toIntArray()
        return temp
    }
}