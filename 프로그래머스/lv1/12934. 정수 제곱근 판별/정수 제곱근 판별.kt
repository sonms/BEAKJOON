import kotlin.math.sqrt
import kotlin.math.pow
class Solution {
    fun solution(n: Long): Long {
        val s = sqrt(n.toDouble())
        val integer = s.toInt()
        if (s - integer > 0) {
            return -1
        } else {
            var answer: Long = (s+1).pow(2).toLong()
            return answer
        }
       
    }
}