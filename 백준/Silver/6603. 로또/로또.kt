import java.io.BufferedWriter
import java.io.OutputStreamWriter

private val results = mutableListOf<Int>()
private val answer = mutableListOf<String>()

fun combination(arr:List<Int>, count: Int = 0, index: Int = 0, depth: Int = 0) {
    if (depth == count) {
        //println("[${results.joinToString(", ")}]") // 완성된 조합
        answer.add(results.joinToString(" ")+"\n")
        return
    }

    for (i in index until arr.size) {
        results.add(arr[i])
        combination(arr, count, i + 1, depth + 1)
        results.removeAt(results.lastIndex)
    }
}

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val input = readln().split(" ").map { it.toInt() }.toMutableList()
        if (input.first() == 0) {
            break
        }
        input.remove(input.first())
        combination(input, 6, 0, 0)
        answer.add("\n")
    }
    answer.forEach {
        bw.write(it)
    }
    bw.flush()
    bw.close()
}