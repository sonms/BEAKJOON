class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val answer = Array<String>(strings.size) {_->""}
        for (i in strings.indices) {
            answer[i] = strings[i]
        }
        answer.sortWith(compareBy({it[n]}, {it}))
        
        return answer
    }
}