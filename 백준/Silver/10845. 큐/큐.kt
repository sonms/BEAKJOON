import java.util.*

fun checkNum(s : String) : Boolean {
    val temp = s.replace("\\D".toRegex(),"")
    // \\D는 [^0-9] 즉 0~9의 숫자가 아닌 문자열을 의미
    // 따라서 숫자가 아닌 문자들을 공백으로 변경하라는 의미
    var result = true
    if (temp.isEmpty()) {
        result = false
    }
    return result
}
fun main() {
    val sb = StringBuilder()
    val rearr = arrayListOf<Int>()
    var q : Queue<Int> = LinkedList<Int>()
    val input1 = readLine()!!.toInt()
    for (i in 1..input1) {
        val input = readLine()!!.toString()
        if (checkNum(input)) {
            val t = input.split(" ")
            val s = t[1].toInt()
            q.offer(s)
        } else {

            if (input == "size") {
                rearr.add(q.size)
            }
            if (input == "empty") {
                if (q.isEmpty()) {
                    rearr.add(1)
                } else {
                    rearr.add(0)
                }
            }
            if (input == "front") {
                if(q.isEmpty()) {
                    rearr.add(-1)
                } else {
                    rearr.add(q.peek())
                }
            }
            if (input == "back") {
                if (q.isEmpty()) {
                    rearr.add(-1)
                } else {
                    rearr.add(q.last())
                }
            }
            if (input == "pop") {
                if (q.isEmpty()) {
                    rearr.add(-1)
                } else {
                    val f = q.peek()
                    rearr.add(f)
                    q.poll()
                }
            }
        }
    }

    rearr.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}