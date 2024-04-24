import java.io.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val arr1 = br.readLine().split(" ").map { it.toInt() }.sorted()
        val m = br.readLine().toInt()
        val arr2 = br.readLine().split(" ").map { it.toInt() }

        /*for (i in arr2) {
            val temp = arr1.binarySearch(i).takeIf { it >= 0 }?: -1
            if (temp != -1) {
                sb.append("1\n")
            } else {
                sb.append("0\n")
            }
        }*/
        val found = arr2.map { arr1.binarySearch(it) >= 0 }
        found.forEach {
            if (it) {
                sb.append("1\n")
            } else {
                sb.append("0\n")
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}