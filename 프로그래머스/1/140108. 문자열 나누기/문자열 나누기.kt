class Solution {
    fun solution(s: String): Int {
        var input = s
        var xCount = 0
        var nXCount = 0
        var answer = 0
        var i = 0
        while (input.isNotEmpty()) {
            if (i >= input.length) break // 인덱스가 문자열의 길이를 초과하지 않도록 검사
            if (input[i] == input[0]) { // s[i]와 s[0]이 같을 때
                xCount += 1
                i += 1

            
            } else { // s[i]와 s[0]이 다를 때
                nXCount += 1
                if (xCount == nXCount) {
                    if (i + 1 <= input.length) {
                        input = input.substring(i + 1)
                    }
                    answer += 1
                    i = 0
                    xCount = 0
                    nXCount = 0
                    continue
                }
                i += 1
            }
        }

        if (xCount == nXCount && input.isNotEmpty() || input.isNotEmpty()) {
            answer += 1
        }
        return answer
    }
}