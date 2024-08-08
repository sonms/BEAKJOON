import kotlin.math.sqrt
class Solution {

    fun divisor(n : Int) : Int {
        var cnt = 0
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (i * i == n) { //제곱근이므로 1개로 카운트
                cnt += 1
            } else if (n % i == 0){ //나머지는 절반까지니 x2
                cnt += 2
            }
        }

        return cnt
    }

    fun solution(number: Int, limit: Int, power: Int): Int {
        val numList = ArrayList<Int>()
        val divisorList = ArrayList<Int>()
        var answer: Int = 0
        
        repeat(number) {
            numList.add(it+1)
        }
        
        repeat(numList.size) {
            divisorList.add(divisor(numList[it]))
        }
        
        divisorList.forEach {
            answer += if (it > limit) {
                power
            } else {
                it
            }
        }   
        
        
        return answer
    }
}