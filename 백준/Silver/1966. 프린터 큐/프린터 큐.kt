import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val input = readln().toInt()
    val answer = ArrayList<Int>()
    var temp = 1

    repeat(input) {
        val testCase = readln().split(" ").map { it.toInt() } //N, M
        //pair<index, 중요도>
        val queue : Queue<Pair<Int, Int>> = LinkedList()

        val queueData = readln().split(" ").map { it.toInt() } //큐에 들어갈 문서 중요도
        for (i in queueData.indices) {
            queue.add(Pair(i, queueData[i]))
        }

        while (queue.isNotEmpty()) {
            //첫 값보다 큰 값이 존재할 때 true, 뒤로 이동
            val containsGreaterThanOne = queue.any { it.second > queue.peek().second }

            if (containsGreaterThanOne) {
                queue.add(queue.poll())
            } else {
                if (queue.peek().first == testCase[1]) {
                    answer.add(temp)
                    temp = 1
                    break
                } else {
                    queue.poll()
                    temp++
                }
            }
        }
    }
    
    answer.forEach {
        println(it)
    }
}