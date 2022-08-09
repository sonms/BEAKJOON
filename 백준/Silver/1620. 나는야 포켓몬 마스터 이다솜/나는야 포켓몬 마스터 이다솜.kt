import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val (n,m) = br.readLine().split(" ")
    val illustrated_Book_name = HashMap<String,Int>()
    val illustrated_Book_num = HashMap<Int,String>()
    val answer = arrayListOf<String>()
    illustrated_Book_name["0"] = 0
    illustrated_Book_num[0] = "0"
    for (i in 1..n.toInt()) {
        val name = br.readLine().toString()
        illustrated_Book_name.put(name , i)
        illustrated_Book_num.put(i , name)
    }

    for (j in 1..m.toInt()) {
        val question = br.readLine().toString()
        val tmpck = question.elementAt(0)
        if (tmpck.isDigit()) {
            val t = illustrated_Book_num[question.toInt()]
            answer.add(t.toString())
        } else {
            val t = illustrated_Book_name[question]
            answer.add(t.toString())
        }
    }
    answer.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}