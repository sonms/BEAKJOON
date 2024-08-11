class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        val answerMap = HashMap<Int, String>()
    
        repeat(N) { rs ->
            if (stages.count {it >= rs +1 } == 0) {
                answerMap[rs+1] = "0.0"
            } else {
                answerMap[rs+1] = String.format("%.16f", (stages.count { it == rs+1 }.toDouble() / stages.count {it >= rs +1 }.toDouble()).toDouble())
            }
        }

        val temp = answerMap.toList().sortedByDescending { it.second }
        
        temp.forEach {
            answer = answer.plus(it.first)
        }
        return answer
    }
}