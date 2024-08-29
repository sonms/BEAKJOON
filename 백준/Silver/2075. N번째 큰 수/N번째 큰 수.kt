import java.util.*

fun main() {
    val input = readln().toInt()
    val graph = Array(input) { IntArray(input) }

    repeat(input) {row ->
        val graphData = readln().split(" ").map { it.toInt() }.sorted()

        for (col in graphData.indices) {
            graph[row][col] = graphData[col]
        }
    }

    val minHeap = PriorityQueue<Int>()

    for (i in 0 until input) {
        for (j in 0 until input) {
            minHeap.add(graph[i][j])

            // 힙의 크기가 k를 초과하면 가장 작은 요소를 제거
            if (minHeap.size > input) {
                minHeap.poll()
            }
        }
    }

    val inputLargest = if (minHeap.size == input) minHeap.peek() else null
    println(inputLargest)
}