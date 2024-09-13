class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var todayTotalDays = 0
        today.split(".").mapIndexed { index, s ->
            todayTotalDays += when (index) {
                0 -> {
                    s.toInt() * 12 * 28
                }
                1 -> {
                    s.toInt() * 28
                }
                else -> {
                    s.toInt()
                }
            }
        }

        for (i in privacies.indices) {
            val tempYear = privacies[i].split(" ").first().split(".").first().toInt() * 12 * 28
            val tempMonth = (privacies[i].split(" ").first().split(".")[1].toInt()) * 28
            val tempDay = privacies[i].split(" ").first().split(".").last().toInt()
            val t = terms.find { it.split(" ").first() == privacies[i].split(" ").lastOrNull() }?.split(" ")?.last()?.toInt()!! * 28
            val totalDays = tempYear + tempMonth + tempDay + t
            //140 + 2 + 168 = 320


            if (totalDays <= todayTotalDays) {
                answer = answer.plus(i+1)
            }
        }
        return answer
    }
}