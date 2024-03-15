import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val a = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val stack = Stack<Int>() //수열의 index저장

    for (i in 0 until n) {
        while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
            a[stack.pop()] = a[i]
        }
        stack.push(i)
    }

    while (!stack.isEmpty()) {
        a[stack.pop()] = -1
    }
    
    a.forEach { 
        bw.write("$it ")
    }
    bw.flush()
    bw.close()
   
}