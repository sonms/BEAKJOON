import java.io.*
import java.util.LinkedList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val q = LinkedList<Int>()

    repeat(br.readLine().toInt()) {
        val order = br.readLine().split(" ")

        when(order.first().toString()) {
            "push" -> {
                q.add(order.last().toInt())
            }

            "pop" -> {
                if (q.isEmpty()) {
                    sb.append("-1\n")
                } else {
                    sb.append("${q.removeFirst()}\n")
                }
            }

            "size" -> {
                sb.append("${q.size}\n")
            }

            "empty" -> {
                if (q.isEmpty()) {
                    sb.append("1\n")
                } else {
                    sb.append("0\n")
                }
            }

            "front" -> {
                if (q.isEmpty()) {
                    sb.append("-1\n")
                } else {
                    sb.append("${q.first()}\n")
                }
            }

            "back" -> {
                if (q.isEmpty()) {
                    sb.append("-1\n")
                } else {
                    sb.append("${q.last()}\n")
                }
            }
        }
        //println(q)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}