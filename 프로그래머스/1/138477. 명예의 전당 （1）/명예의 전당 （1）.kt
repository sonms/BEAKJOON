class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var hallOfFame = arrayListOf<Int>()
        var answer = intArrayOf()
        for (i in score) {
            hallOfFame.add(i)
            if (hallOfFame.size > k) {
                hallOfFame.sortDescending()
                hallOfFame = ArrayList(hallOfFame.take(k))
            }
            answer = answer.plus(hallOfFame.minOf { it })
            //println(hallOfFame)
        }
        return answer
    }
}