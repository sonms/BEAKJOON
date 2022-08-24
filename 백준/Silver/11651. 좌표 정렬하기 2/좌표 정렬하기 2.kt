import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    val arr = arrayListOf<Pair<Int,Int>>()
    val sb = StringBuilder()
    for (i in 1..input) {
        val s = br.readLine().split(" ")
        arr.add(Pair(s[0].toInt(),s[1].toInt()))
    }
    br.close()
    val sort = arr.toList().sortedWith(compareBy({it.second},{it.first}))
    sort.forEach {
        sb.append(it.toList().joinToString(" ","","")).append("\n")
    }
    print(sb)
}