class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val tangerineList = tangerine.toList()
        var c = 0
        val frequencyMap = tangerineList.groupingBy { it }.eachCount()
        val frequencySortedMap = frequencyMap.entries.sortedByDescending { it.value }

        for (i in frequencySortedMap) {
            c += i.value
            answer += 1

            if (c >= k) {
                break
            }
        }
    
        return answer
    }
}