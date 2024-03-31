import java.util.*
import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val sb = StringBuilder()

    /*
    * Comparator를 사용하여 PriorityQueue가 절댓값에 따라 요소를 정렬하도록 지정했습니다.
      Comparator의 compare 함수에서는 두 개의 값을 비교합니다.
      절댓값이 같은 경우에는 값 자체를 비교하고, 그렇지 않으면 절댓값을 비교합니다.*/
    val pq = PriorityQueue<Int>( Comparator { o1, o2 -> //o1이 나중에 들어온값, o2그 전에 들어온값
        val abs1 = abs(o1)
        val abs2 = abs(o2)

        when (abs1) {
            // 두 값의 값이 같을 경우, 부호를 비교해서 오름차순으로 정렬.
            // 두 값이 다를 경우, 그냥 절댓값에서 숫자의 크기로 비교해서 오름차순으로 정렬
            abs2 -> o1 - o2
            else -> abs1 - abs2
        }
    })


    val n = br.readLine().toInt()
    repeat(n) {
        val x = br.readLine().toInt()
        if (x != 0) {
            pq.offer(x)
            //println(pq)
        } else {
            if(pq.isEmpty()) {
                sb.append("0\n")
            } else {
                sb.append("${pq.poll()}\n")
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}