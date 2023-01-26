class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0,0)
        val s = brown + yellow
        
        for (i in 3..s)  {
            val c = s / i //가로
            val r = i //세로
            
            if (c >= r) {
                if (( r - 2 ) * ( c -  2 ) == yellow) {
                    answer[0] = c
                    answer[1] = r
                    return answer
                } 
            } else {
                continue
            }
        }
        return answer
    }
}