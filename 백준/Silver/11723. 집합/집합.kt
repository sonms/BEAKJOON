import java.io.*
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val m = br.readLine().toInt()
    val q : Queue<Int> = LinkedList()
    //val answer = arrayListOf<Int>()

    repeat(m) {
        val st = StringTokenizer(br.readLine())
        /*val cal = st.nextToken()
        //print(input)
       *//* val cal = input[0]
        val n = input[1].toInt()*//*
        val n = st.nextToken().toInt()*/
        if (st.hasMoreTokens()) {
            val cal = st.nextToken()
            if (st.hasMoreTokens()) {
                val n = st.nextToken().toInt()
                // 여기에서 계속 처리
                if (cal == "add") {
                    if (!q.contains(n)) {
                        q.add(n)
                        //println("qa" + q)
                    }
                } else if (cal == "remove") {
                    if (q.contains(n)) {
                        q.remove(n)
                        //println("qr" + q)
                    }
                } else if (cal == "check") {
                    if (!q.contains(n)) {
                        bw.write("0\n")
                    } else {
                        bw.write("1\n")
                    }
                } else if (cal == "toggle") {
                    if (q.contains(n)) {
                        q.remove(n)
                        //println("qt" + q)
                    } else {
                        q.add(n)
                        //println("qt" + q)
                    }
                }
            } else {
                if (cal == "all") {
                    q.clear()
                    for (i in 1..20) {
                        q.add(i)
                    }
                } else if (cal == "empty") {
                    q.clear()
                }
            }
        }
    }
    bw.flush()
}
