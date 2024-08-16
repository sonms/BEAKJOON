import java.util.Stack
class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val answerHamburger = listOf<Int>(
            1,2,3,1
        )
        val stack = Stack<Int>()
        for (i in ingredient) {
            stack.add(i)
            //println(stack)
            if (stack.size >= 4 && stack.takeLast(4) == answerHamburger) {
                answer += 1
                repeat(4) {
                    stack.removeAt(stack.size - 1)
                }
            }
        }
        return answer
    }
}