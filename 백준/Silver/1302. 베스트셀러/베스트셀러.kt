import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val hm = HashMap<String,Int>()
    var temp = 1
    val input = br.readLine().toInt()

    for (i in 1..input) {
        val book = br.readLine().toString()
        if (i == 1) {
            hm.put(book,1)
        } else {
            if (hm.containsKey(book)) {
                hm[book] = hm[book]!! + 1
            } else {
                hm.put(book,1)
                continue
            }
        }
    }
    val sortedmap = arrayListOf<Pair<String,Int>>()
    for ((key,value) in hm.entries) {
        sortedmap.add(Pair(key,value))
    }
    sortedmap.sortWith(compareBy<Pair<String,Int>> {it.first}.thenBy { it.second })

    var max = 0
    var answer = ""
    for ((key,value) in sortedmap) {
        if (max < value) {
            max = value
            answer = key
        }
    }
    print(answer)
}