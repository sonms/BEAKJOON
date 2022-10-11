class Solution {
    fun solution(n: Long): Long {
        var answer: String = ""
        val temp = n.toString().chunked(1).map{it}
        val sort = temp.sortedDescending()
        
        for(i in sort.indices) {
            answer += sort[i]
        }
        
        return answer.toLong()
    }
}