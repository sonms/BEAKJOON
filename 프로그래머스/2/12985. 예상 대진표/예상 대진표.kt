import kotlin.math.roundToInt
class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var aParticipant = a
        var bParticipant = b
 
        val game = n - 1

        for (i in 1..game) {
            if ((aParticipant + 1 == bParticipant && aParticipant % 2 != 0) || (aParticipant - 1 == bParticipant && bParticipant % 2 != 0)) {
            answer += 1
            break
        }


            aParticipant = (aParticipant.toDouble()/2).roundToInt()
            bParticipant = (bParticipant.toDouble()/2).roundToInt()
            answer+=1
        }
        return answer
    }
}