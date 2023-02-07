class Solution {
    val answerArr = arrayListOf<Int>()
    val answer = arrayListOf<Int>()
    
    fun combination(arr : IntArray, cnt : Int, depth : Int, start : Int) {
        if (cnt == depth) {
            if (answer.contains(answerArr.sum())) {

            } else {
                answer.add(answerArr.sum())
            }
            return
        }

        for (i in start until arr.size) {
            answerArr.add(arr[i])
            combination(arr, cnt + 1, depth, i + 1)
            answerArr.removeAt(answerArr.lastIndex)
        }
    }
    
    fun solution(numbers: IntArray): IntArray {
        combination(numbers, 0, 2, 0)
        
        return answer.sorted().toIntArray()
    }
}