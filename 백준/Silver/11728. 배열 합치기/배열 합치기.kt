import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val f = br.readLine().split(" ").map { it.toInt() }
    val s = br.readLine().split(" ").map { it.toInt() }
    val t = (f+s).map { it.toInt() }.sorted()

    bw.write(t.joinToString(" "))
    bw.flush()
    bw.close()
}