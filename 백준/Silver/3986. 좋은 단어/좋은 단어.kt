import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()
    var answer = 0
    for (i in 1..input) {
        val stack = Stack<Char>()
        val word = br.readLine().toString()
        for (j in word.indices) {
            if (stack.isEmpty()) {
                stack.push(word[j])
            } else if (stack.peek() == word[j]) {
                stack.pop()
            } else {
                stack.push(word[j])
            }
        }

        if (stack.isEmpty()) {
            answer += 1
        }
    }

    bw.write(answer.toString())
    bw.flush()
    bw.close()
}