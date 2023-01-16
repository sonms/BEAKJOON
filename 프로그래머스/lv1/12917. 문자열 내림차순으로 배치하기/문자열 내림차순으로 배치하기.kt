class Solution {
    fun solution(s: String): String {
        var answer = ""
        val arr = arrayListOf<Char>()
        for (i in s.indices) {
            arr.add(s[i])
        }
        val ad = arr.sortedDescending()
        for (j in ad.indices) {
            answer += ad[j]
        }
        return answer
    }
}