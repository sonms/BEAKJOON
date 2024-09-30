import java.util.LinkedList
import java.util.Queue
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val prioritiesMap = priorities.mapIndexed { index, i -> i to index }


        val queue: Queue<Pair<Int, Int>> = LinkedList(prioritiesMap)
        val priority = mutableListOf<Pair<Int, Int>>()

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            if (queue.none { it.first > current.first }) {
                priority.add(current)
            } else {
                queue.offer(current)
            }
        }
        answer = priority.indexOf(priority.find { it.second == location })+1

        
        return answer
    }
}