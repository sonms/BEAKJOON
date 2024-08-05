class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val scoreToList = score.sorted()
        
        if (m <= scoreToList.size) {
        if (scoreToList.size % m == 0) { //배수체크
            val temp = scoreToList.chunked(m)
            temp.forEach {
                answer += it.minOf { it } * m
            }
        } else {
            val fromIndex = scoreToList.size % m
            val temp = scoreToList.subList(fromIndex, score.size).chunked(m)

            temp.forEach {
                answer += it.minOf { it } * m
            }

        }
    }
        return answer
    }
}