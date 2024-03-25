import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val n = readln().toInt()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val intArray = readln().split(" ").map { it.toInt() }.toIntArray()
    val m = br.readLine().toInt()
    val sum = IntArray(n+1){0}

    //sum[0] = intArray[0]
    sum[1] = intArray[0]
    for (i in 2 .. n) {
        sum[i] = sum[i-1] + intArray[i-1] //누적합 0~1, 0~2...의 누적모음

    }
    

    for (i in 0 until m) {
        val (k, j)= br.readLine().split(" ").map { it.toInt() }
        //0~1 누적합과 0~3누적합은
        //0~3누적합 - 0~0까지의 누적합은 1~3까지의 누적합과 같다
        bw.write((sum[j] - sum[k-1]).toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}
