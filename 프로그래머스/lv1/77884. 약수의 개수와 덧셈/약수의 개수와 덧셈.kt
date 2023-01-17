import kotlin.math.pow

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        val arr = arrayListOf<Int>()
        var mul = 1.0
        while(true) {
            val t = (mul).pow(2)
            if (t > right) {
                break
            }
            if (t >= left && t <= right) {
                arr.add(t.toInt())
            }
            mul += 1.0
        }
        val sum = arr.sum() * 2
        for (i in left..right) {
            answer += i
        }
        answer = answer - sum
        return answer
    }
}