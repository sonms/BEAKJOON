class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val leftSet = mutableSetOf<Int>()
        val rightMap = mutableMapOf<Int, Int>()
        
        for (i in topping) {
            rightMap[i] = rightMap.getOrDefault(i, 0) + 1
        }
        
        for (j in topping) {
            leftSet.add(j)
            rightMap[j] = rightMap[j]!! - 1

            if (rightMap[j] == 0) {
                rightMap.remove(j)
            }

            if (leftSet.size == rightMap.size) {
                answer++
            }
        }
        
        return answer
    }
}