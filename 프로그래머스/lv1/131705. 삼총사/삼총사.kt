class Solution {
    val t = arrayListOf<Int>()
    val answerArr = arrayListOf<Int>()
    
    fun combination(arr : IntArray, cnt : Int, depth : Int, start : Int) {
        if (cnt == depth) {
            answerArr.add(t.sum())
            return
        }

        for (i in start until arr.size) {
            t.add(arr[i])
            combination(arr, cnt + 1, depth, i + 1)
            t.removeAt(t.lastIndex)
        }
    }
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        combination(number, 0, 3, 0)
        answer = answerArr.count { it == 0 }
        return answer
    }
}