import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val arr = arrayListOf<Pair<Int, Int>>()
    val answer = arrayListOf<Pair<Int,Int>>()
    arr.add(Pair(1,0)) //0
    arr.add(Pair(0,1)) //1
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tc = br.readLine()!!.toInt()
    repeat(41) {
            t -> if (t > 1) {
            arr.add(Pair(arr[t-1].first + arr[t-2].first,arr[t-1].second + arr[t-2].second))
        }
    }
    for (i in 1..tc) {
        val tmp = br.readLine()!!.toInt()
        answer.add(Pair(arr[tmp].first,arr[tmp].second))
    }
    repeat(answer.size) {
        an -> println("${answer[an].first} ${answer[an].second}")
    }

}