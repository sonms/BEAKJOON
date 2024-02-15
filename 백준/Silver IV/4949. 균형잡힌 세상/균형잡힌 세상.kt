import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    
    while (true) {
        val input = br.readLine().toString()
        if (input == ".") break
        
        val stack = Stack<Char>()
        var isBalanced = true
        
        for (ch in input) {
            if (ch == '(' || ch == '[') {
                stack.push(ch)
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty() || 
                    (ch == ')' && stack.peek() != '(') || 
                    (ch == ']' && stack.peek() != '[')) {
                    isBalanced = false
                    break
                }
                stack.pop()
            }
        }
        
        if (isBalanced && stack.isEmpty()) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }
    
    bw.flush()
}