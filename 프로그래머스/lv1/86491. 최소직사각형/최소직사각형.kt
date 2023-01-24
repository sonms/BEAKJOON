class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var w = 0
        var h = 0
        for (i in sizes.indices) {
            w = Math.max(Math.min(sizes[i][0], sizes[i][1]), w)
        
            h = Math.max(Math.max(sizes[i][0], sizes[i][1]), h)
        }
        answer = w * h
        return answer
    }
}