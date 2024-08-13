class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        val groupX = X.groupingBy { it }.eachCount()
        val groupY = Y.groupingBy { it }.eachCount()
        
        val answerList = ArrayList<String>()

        for (i in groupX.keys) {
            if (groupY.containsKey(i)) {
                val cnt = minOf(groupX[i]!!, groupY[i]!!)
                 repeat(cnt.toInt()) {
                    answerList.add(i.toString())
                }
            }
        }

        if (answerList.all { it == "0" } && answerList.isNotEmpty()) {
            //answerList.clear()
            answer += "0"
        } else if (answerList.isEmpty()) {
            answer += "-1"
        } else {
            answerList.sortDescending()
            answer = answerList.joinToString("") { it.toString() }
        }
        return answer
    }
}