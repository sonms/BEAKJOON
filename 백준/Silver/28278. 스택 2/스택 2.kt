import java.io.*
import java.util.LinkedList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val stack = LinkedList<Int>()

    repeat(n) {
        val order = br.readLine().split(" ").map { it.toInt() }
        when(order.first()) {
            1 -> {
                stack.add(order.last())
            }

            2->{
                if (stack.isNotEmpty()) {
                    sb.append("${stack.last}\n")
                    stack.removeLast()
                } else {
                    sb.append("-1\n")
                }
            }

            3->{
                sb.append("${stack.size}\n")
            }

            4->{
                if (stack.isEmpty()) {
                    sb.append("1\n")
                } else {
                    sb.append("0\n")
                }
            }

            5->{
                if (stack.isNotEmpty()) {
                    sb.append("${stack.last}\n")
                } else {
                    sb.append("-1\n")
                }
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}