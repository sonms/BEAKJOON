import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val num = br.readLine().split(" ").map { it.toInt() }.sorted()
    println(num[k-1])

}