import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val s = ArrayList<String>()

    repeat(n) {
        s.add(br.readLine().toString())
    }

    repeat(m) {
        val temp = br.readLine().toString()

        if (s.contains(temp)) {
            answer += s.count { it == temp }
        }
    }

    bw.write(answer.toString())
    bw.flush()
    bw.close()
}