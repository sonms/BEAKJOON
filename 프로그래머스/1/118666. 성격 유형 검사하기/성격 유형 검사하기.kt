class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        
        //유형 , 점수
        val answerHm = HashMap<String, Int>()

        //선택값, 점수
        val choiceScore = HashMap<Int, Int>()
        choiceScore[1] = 3 //매비동
        choiceScore[2] = 2 //비동
        choiceScore[3] = 1 //약비동

        choiceScore[4] = 0 //모름

        choiceScore[5] = 1 //약동
        choiceScore[6] = 2 //동
        choiceScore[7] = 3 //매동

        for (i in survey.indices) {
        if (choices[i] >= 5) { //아래
            if (answerHm.containsKey(survey[i].chunked(1).last())) {
                val last = answerHm[survey[i].chunked(1).last()]
                answerHm[survey[i].chunked(1).last()] = last!! + choiceScore[choices[i]]!!
            } else {
                answerHm[survey[i].chunked(1).last()] = choiceScore[choices[i]]!!
            }
        }
        else { //위
            if (answerHm.containsKey(survey[i].chunked(1).first())) {
                val first = answerHm[survey[i].chunked(1).first()]
                answerHm[survey[i].chunked(1).first()] = first!! + choiceScore[choices[i]]!!
            } else {
                answerHm[survey[i].chunked(1).first()] = choiceScore[choices[i]]!!
            }
        }
    }
        
        val comparisonMap = mapOf(
            "R" to "T",
            "C" to "F",
            "J" to "M",
            "A" to "N"
        )

        for ((key, value) in comparisonMap) {
            val result1 = answerHm[key] ?: 0
            val result2 = answerHm[value] ?: 0
            if (result1 > result2 || (result1 == result2 && key < value)) {
                answer += key
            } else {
                answer += value
            }
        }
        
        return answer
    }
}