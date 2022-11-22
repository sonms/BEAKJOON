class Solution {
    fun solution(arr: IntArray): ArrayList<Int> {
        var answer : java.util.ArrayList<Int>
        val empty = arrayListOf<Int>()
        val min = arr.minOrNull()
        answer = arr.filter {it != min} as ArrayList<Int>
        empty.add(-1)
        return if (answer.isEmpty()) {
            empty
        } else {
            answer
        }
    }
}