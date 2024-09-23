class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val result = mutableSetOf<Int>()
        val size = elements.size

        for (len in 1..elements.size) {
            for (i in elements.indices) {
                var sum = 0
                for (j in 0 until len) {
                    sum += elements[(i + j) % size] 
                }
                result += sum
            }
        }
        answer = result.size
        return answer
    }
}