import java.util.Stack
class Solution {
    fun checkRemainder(progresses : Int, speeds : Int) : Int {
        if ((100 - progresses) % speeds > 0) {
            return (100 - progresses)/speeds+1
        }
        return (100 - progresses)/speeds
    }
    
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val work = Stack<Int>()
        var answer = intArrayOf()
        var max = 0
        var temp = 0
        for (i in progresses.indices) {
            if (work.isEmpty()) {
                val complete = checkRemainder(progresses[i], speeds[i])
                work.add(complete)
                max = complete
            } else {
                val complete = checkRemainder(progresses[i], speeds[i])
                if (work.peek() >= complete) {
                    temp += 1
                    work.add(complete)
                } else {
                    work.add(complete)
                    if (max < complete) {
                        temp += 1
                        max = complete
                        answer = answer.plus(temp)
                        temp = 0
                    } else {
                        temp += 1
                    }
                }
            }
        }

        answer = answer.plus(temp+1)
        return answer
    }
}