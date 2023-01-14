class Solution {
    fun solution(num: Int): Int {
        var nl = num.toLong()
        var answer = 0
        var c = 0
        if (nl == 1L) {
            answer = 0
        } else {
            while (nl != 1L) {
                if (nl % 2 == 0L) {
                    nl /= 2L
                } else {
                    nl = nl*3+1
                }
                c += 1
                
                if (c == 500) {
                    return -1
                }
            }
        }
        answer = c
        
        return answer
    }
}