import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    val arr = arrayListOf<Pair<Int,Int>>()
    var i = 0
    var cnt = 1
    for (i in 1..input) {
        val s = br.readLine().split(" ")
        arr.add(Pair(s[0].toInt(),s[1].toInt()))
    }
    arr.sortWith(compareBy({ it.second },{it.first}))
    var time = arr.first().second
    for (j in 1 until input) {
        if (time <= arr[j].first) {
            cnt += 1
            time = arr[j].second
        }
    }
    println(cnt)
}