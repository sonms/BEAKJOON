import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = HashMap<String, Int>()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(n) {
        val word = br.readLine().toString()
        if (arr.containsKey(word)) {
            arr[word] = arr[word]!! +1
        } else {
            arr[word] = 0
        }
    }

    val answer = arr.filter { it.key.length >= m }
        .toList()
        .sortedWith(
            compareByDescending<Pair<String, Int>> { it.second }.thenByDescending { it.first.length }.thenBy { it.first })

    answer.forEach {
        bw.write(it.first)
        bw.newLine()
    }
    bw.flush()
    bw.close()
}