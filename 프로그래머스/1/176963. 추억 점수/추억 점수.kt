class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        
        val hm = HashMap<String, Int>().apply {
            name.forEachIndexed { index, s -> 
            this[s] = yearning[index]
            }
        }
        
        val totalScore = photo.map { innerArr ->
            innerArr.filter {
                it in hm
            }.sumOf {
                hm[it]!!
            }
        }
        for (i in totalScore.indices) {
            answer += totalScore[i]
        }
        
        return answer
    }
}