import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var v = 1
    val tc = br.readLine().toInt()
    val checkType = HashMap<String,Int>()
    val answer = arrayListOf<Int>()
    val sb = StringBuilder()
    for (i in 1..tc) {
        val n = br.readLine().toInt()
        for (j in 1..n) {
            val (f,s) = br.readLine().split(" ")
            if (checkType.containsKey(s)) {
                checkType.replace(s,checkType[s]!!.toInt()+1)
            } else {
                checkType[s] = 1
            }
        }
        for (k in checkType.values) {
            v *= k+1
        }
        answer.add(v-1)
        v = 1
        checkType.clear()
    }
    answer.forEach {
        sb.append(it).append("\n")
    }
    print(sb)
}