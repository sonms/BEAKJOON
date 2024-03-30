import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br= BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val card = br.readLine().split(" ").map { it.toInt() }.sorted()

    val m = br.readLine().toInt()
    val checkCard = br.readLine().split(" ").map { it.toInt() }

    repeat(m) {
        val temp = card.binarySearch(checkCard[it]) //그값이있으면 index
        //println(temp)
        if (temp >= 0) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }
    bw.flush()
    bw.close()
}