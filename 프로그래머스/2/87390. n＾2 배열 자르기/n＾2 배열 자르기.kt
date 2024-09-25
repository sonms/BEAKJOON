class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        /*val arr = Array(n) { row -> Array(n) {Pair(0L,0)} }
        var answer = intArrayOf()
        for (i in 0 until n) { // row
            for (j in 0 until n) { // col
                arr[i][j] = Pair((i * n + j + 1).toLong(), maxOf(j + 1, i + 1)) // 좌표로 계산
            }
        }

        answer = arr.flatten().filter { it.first in left+1..right+1 }.map { it.second }.toIntArray()*/
        /*var answer = intArrayOf()
        for (i in 0 until n) { // row
            for (j in 0 until n) { // col
                if ((i * n + j + 1) in left+1..right+1) {
                    answer = answer.plus(maxOf(i+1, j+1))
                }
            }
        }*/
        
        var answer = intArrayOf()
        
        for (index in left..right) {
            val i = (index / n).toInt()
            val j = (index % n).toInt()

            answer = answer.plus(maxOf(i + 1, j + 1))
        }


        return answer
    }
}