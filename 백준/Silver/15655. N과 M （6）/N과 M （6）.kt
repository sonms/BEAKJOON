import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val results = arrayListOf<Int>()
private val answer = arrayListOf<String>()

fun combination(cnt : Int, start : Int, depth : Int, arr : List<Int>) {
    if (cnt == depth) {
        //println(results)
        /*if (results.first() < results.last()) {
            answer.add(results.joinToString(" "))
        }*/
        var cnt2 = 0 //최대가 바뀐횟수
        //println(tempList)
        //var firstMax = tempList.maxOrNull()
        var temp = Pair(results.first(), 0)
        if (results.size > 1) {
            for (i in 0 until results.size) {
                if (temp.first <= results[i] && temp.second < i) {
                    temp = temp.copy(first = results[i], second = i)
                    //result.add(tempList.joinToString(" "))
                    //println("s " + temp)
                    cnt2 ++
                }
            }
            if (cnt2 == results.size-1) {
                answer.add(results.joinToString(" "))
            }
        } else {
            answer.add(results.joinToString(" "))
        }
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
    val arr = br.readLine().split(" ").map { it.toInt() }

    /*for (i in 1..n) {
        arr.add(i)
    }*/

    //arr.sorted()

    combination(0,0,m, arr.sorted())

    answer.forEach {
        bw.write(it)
        bw.newLine()
    }
    bw.flush()
    bw.close()

}