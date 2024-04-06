import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val results = arrayListOf<Int>()
private val answer = arrayListOf<String>()

fun combination(cnt : Int, start : Int, depth : Int, arr : ArrayList<Int>) {
    if (cnt == depth) {
        //println(results)
        answer.add(results.joinToString(" "))
        return
    }

    for (i in start until arr.size) {
        results.add(arr[i])
        combination(cnt+1, i+1, depth, arr)
        results.removeAt(results.lastIndex)
    }

}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val arr = ArrayList<Int>()

    for (i in 1..n) {
        arr.add(i)
    }

    combination(0,0,m, arr)

    answer.forEach {
        bw.write(it)
        bw.newLine()
    }
    bw.flush()
    bw.close()

}