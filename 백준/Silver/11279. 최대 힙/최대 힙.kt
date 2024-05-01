import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n) {
        val order = br.readLine().toInt()

        if (order == 0) {
            if (pq.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${pq.poll()}\n")
            }
        } else {
            pq.offer(order)
        }
    }

    bw.flush()
    bw.close()
}