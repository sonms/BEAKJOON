class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        val union = lottos.filter { it != 0 } + win_nums.toMutableList()
        //println(union)
        val zeroCnt = lottos.count { it == 0 }
        //println(zeroCnt)

        val winNumCnt = union.groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }.distinct().size


        //맞힌 수
        when(winNumCnt) {
            0 -> { //낙첨
                answer = if (zeroCnt >= 2) {
                    answer.plus(7 - zeroCnt)
                } else {
                    answer.plus(6)
                }
                answer = answer.plus(6)
            }

            1 -> { //낙
                answer = answer.plus(6-zeroCnt)
                answer = answer.plus(6)
            }

            2 -> {
                answer = answer.plus(5-zeroCnt)
                answer = answer.plus(5)
            }

            3 -> {
                answer = answer.plus(4-zeroCnt)
                answer = answer.plus(4)
            }

            4 -> {
                answer = answer.plus(3-zeroCnt)
                answer = answer.plus(3)
            }

            5 -> {
                answer = answer.plus(2-zeroCnt)
                answer = answer.plus(2)
            }

            6 -> {
                answer = answer.plus(1)
                answer = answer.plus(1)
            }
        }
        return answer
    }
}