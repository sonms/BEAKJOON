import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val input = readln().toInt()

    val q = mutableListOf<Pair<Int, Int>>()
    val answer = mutableListOf<Pair<Int, Int>>()

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 0 until input) {
        q.add(Pair(i, 0))
    }

    for (i in 1..input) {
        repeat(i) {
            q.add(q.first())
            q.removeFirst()
        }
        q[0] = q.first().copy(first = q.first().first, second = i)
        answer.add(q.first())
        q.removeFirst()
    }

    //println("answer "+answer)
    answer.sortBy { it.first }

    answer.forEach {
        bw.write(it.second.toString() + " ")
    }
    bw.flush()
    bw.close()
}