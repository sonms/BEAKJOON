import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun isPrime(n: Int): List<Int> {
    val booleanArray = BooleanArray(n + 1) { true }
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (booleanArray[i]) {
            for (j in i + i..n step i) {
                booleanArray[j] = false
            }
        }
    }
    val p = mutableListOf<Int>() //소수값저장
    for (i in 2..n) {
        if (booleanArray[i]) {
            p.add(i)
        }
    }
    return p
}

fun main() {
    val p = isPrime(100000)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val s = br.readLine().toString()

        if (s == "0") {
            break
        }

        var max = 2
        for (n in p) {
            if (s.contains(n.toString())) {
                max = n
            }
        }
        bw.write(max.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}