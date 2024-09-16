import java.util.Stack
class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val n = board.size
        val flatBoard = board.flatMap { flatInt -> flatInt.map { it } }.toMutableList()
        //크레인에서 뽑은 인형
        val basket = Stack<Int>()

        //배열
        for (i in moves) {
            var result = -1
            val startIndex = (i - 1) % n

            val findIndex = flatBoard.withIndex().indexOfFirst { (index, num) ->
                index % n == startIndex && num != 0
            }

            if (findIndex != -1 && flatBoard[findIndex] != 0) {
                result = flatBoard[findIndex]
                //println(result)
                flatBoard[findIndex] = 0
            }

            if (result != -1) {
                if (basket.isNotEmpty() && basket.peek() == result) {
                    answer += 2
                    basket.pop()
                } else {
                    basket.push(result)
                }
            }
        }
        
        return answer
    }
}