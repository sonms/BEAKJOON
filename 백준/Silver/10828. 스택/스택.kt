import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val stack : Stack<Int> = Stack()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readln().toInt()

    repeat(n) {
        val input = readln().split(" ").map { it.toString() }

        if (input.size > 1) {
            stack.push(input[1].toInt())
        } else {
            if (input[0] == "pop") {
                if (stack.isEmpty()) {
                    bw.write("-1")
                    bw.newLine()
                } else {
                    bw.write(stack.pop().toString())
                    bw.newLine()
                }
            } else if (input[0] == "size") {
                bw.write(stack.size.toString())
                bw.newLine()
            } else if (input[0] == "empty") {
                if (stack.isEmpty()) {
                    bw.write("1")
                    bw.newLine()
                } else {
                    bw.write("0")
                    bw.newLine()
                }
            } else if (input[0] == "top") {
                if (stack.isEmpty()) {
                    bw.write("-1")
                    bw.newLine()
                } else {
                    //println(stack.peek())
                    bw.write(stack.peek().toString())
                    bw.newLine()
                }
            }
        }
    }

    bw.flush()
    bw.close()
}