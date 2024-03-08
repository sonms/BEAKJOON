import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readln().toInt()
    val arrA = readln().split(" ").reversed().map { it.toInt() }
    val q = ArrayDeque<Int>()

    for (i in arrA.indices) {
        //println(arrA[i])
        when(arrA[i]) {
            1 -> {
                q.addLast(i+1)
                //println(q.toString())
            }

            2 -> {
                val temp = q.removeLast()
                q.addLast(i+1)
                q.addLast(temp)
                //println(q.toString())
            }

            3 -> {
                q.addFirst(i+1)
                //println(q.toString())
            }
        }
    }
    val output = q.reversed().joinToString(" ")
    bw.write(output)
    bw.flush()
    bw.close()
}