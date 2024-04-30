import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val q = PriorityQueue<Int>()
    val n = br.readLine().toInt()

    repeat(n) {
        val order = br.readLine().toInt()

        if (order == 0) {
            if (q.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${q.poll()}\n")
            }
        } else {
            q.offer(order)
        }
    }
    //println(q)
    //bw.write(sb.toString())
    bw.flush()
    bw.close()
}