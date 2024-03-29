import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val s = Stack<Int>()
    var num = -1

    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().toInt()
        if (it == 0) {
            for (i in 1..input) {
                s.push(i)
                sb.append("+\n")
            }
        } else if (!s.contains(input)) {
            for (j in num + 1..input) {
                s.push(j)
                sb.append("+\n")
            }
        }

        if (s.last() == input) {
            s.pop()
            sb.append("-\n")
            if (input > num) {
                num = input
            }
        }
    }

    if (s.isNotEmpty()) {
        println("NO")
    } else {
        print(sb)
    }


}