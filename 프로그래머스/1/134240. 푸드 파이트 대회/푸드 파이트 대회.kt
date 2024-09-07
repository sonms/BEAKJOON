class Solution {
    fun solution(food: IntArray): String {
        var answer = ""
        val hm = HashMap<Int, Int>()
        for (i in food.indices) {
            if (i == 0) {
                continue
            }

            if (food[i] / 2 >= 1) {
                hm[i] = food[i] / 2
                answer += "$i".repeat(food[i]/2)
            }
        }
        answer += "0"

        if (hm.isNotEmpty()) {
            for ((key, value) in hm.entries.toList().reversed()) {
                answer += "$key".repeat(value)
            }
        }
        return answer
    }
}